package Handler;


import Data.EksportData;
import Data.ImportData;
import Domain.Resultater;
import UI.TraenerMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;
import Connection.JDBCConnector;

public class TraenerHandler {
TraenerMenu traenerMenu = new TraenerMenu();
Scanner scanner = new Scanner(System.in);

public void tildelStilartSQL(int stilartID, int medlemID) throws SQLException {
    Connection connection = JDBCConnector.getConnection();
    String sql = "INSERT INTO delfin.link_medlem_stilart (medlem_id, stilart_id) VALUES ('" + medlemID + "', '" + stilartID +"');";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.executeUpdate();
}

    public void tildelStilart() throws SQLException {
        System.out.println("Hvilket medlem id skal have tilføjet stilart(er)");
        int medlemID = scanner.nextInt();

        int choice = 0;
        int exitValue = 9;
if (choice != exitValue){
    traenerMenu.printStilarter();
    choice = scanner.nextInt();
    tildelStilartSQL(choice,medlemID);
    }



}

    public void tilføjtræningsresultat() throws SQLException {
        Resultater resultater = new Resultater();
        EksportData eksportData = new EksportData();
Scanner scanner = new Scanner(System.in);
int medlem_id = 0;
int stilart_id = 0;
int milisekunder = 0;
//2016-11-16 06:43:19.77
        Timestamp timestamp = new Timestamp(System.currentTimeMillis()); //32 400 000 for at få det til dansk tid.
        System.out.println("Tilføjer nu et resultat: ");
        System.out.println("Vælg medlem id: ");
        medlem_id = scanner.nextInt();
        resultater.setMedlem_id(medlem_id);

        System.out.println("Vælg stilart_id");
        stilart_id = scanner.nextInt();
        resultater.setStilart_id(stilart_id);

        System.out.println("Indtast træningstid i millisekunder: ");
        milisekunder = scanner.nextInt();
        resultater.setResult(milisekunder);

        resultater.setResult_time(timestamp);
eksportData.saveResult(resultater);

    }



    public void bedsteTræningsResultat() throws SQLException {
        ImportData importData = new ImportData();
        //adder resultater til liste med stilart_id som arguement til at printe lister fra de forskellige dicipliner.
        List <Resultater> resultaterListCrawl = importData.fillListWithResults(1);
        List <Resultater> resultaterListRyg = importData.fillListWithResults(2);
        List <Resultater> resultaterListBryst = importData.fillListWithResults(3);
        List <Resultater> resultaterListFly = importData.fillListWithResults(4);

traenerMenu.printTræningsResultatMenu();
        int resultChoice = scanner.nextInt();
        if (resultChoice == 1){
            System.out.println(resultaterListCrawl);
        } else if (resultChoice == 2){
            System.out.println(resultaterListRyg);
        } else if (resultChoice == 3){
            System.out.println(resultaterListBryst);
        }else if (resultChoice == 4){
            System.out.println(resultaterListFly);
        }else{
            System.out.println("Vælg et gyldigt nummer");
            bedsteTræningsResultat();
        }

    }

    public void tilføjKonkurrenceResultat() {
    //Kommer senere
    }
}

