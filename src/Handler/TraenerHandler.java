package Handler;


import UI.TraenerMenu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import Connection.JDBCConnector;

public class TraenerHandler {
TraenerMenu traenerMenu = new TraenerMenu();
Scanner scanner = new Scanner(System.in);

public void tildelStilartSQL(int stilartID, int medlemID) throws SQLException {
    Connection connection = JDBCConnector.getConnection();
    String sql = "UPDATE delfin.medlem SET stilart_id = "+ stilartID + " WHERE (medlem_id = " + medlemID + ");";
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





    public void tilføjtræningsresultat() {
    }

    public void bedsteTræningsResultat() {
    }

    public void tilføjKonkurrenceResultat() {
    }
}

