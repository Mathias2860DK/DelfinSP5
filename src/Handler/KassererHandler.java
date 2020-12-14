package Handler;

import Data.ImportData;
import Domain.Medlem;

import java.sql.*;
import java.util.List;
import java.util.Scanner;
import Connection.JDBCConnector;

public class KassererHandler {
ImportData importData = new ImportData();
Scanner scanner;
//henter medlemer fra liste fra
    public void seRestance() throws SQLException {
        //List<Medlem> medlemList = importData.fillListWithData();
        System.out.println("Medlemer i restance: ");
        String sql = "select * from medlem where medlem_balance < 0;";
        Connection connection = JDBCConnector.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println("Medlem id: " + resultSet.getInt("medlem_id") + ", " + "Navn:  " +
                    resultSet.getString("navn") +
                    ", " + "Medlems balance: " + resultSet.getInt("medlem_balance"));
        }

        //select * from medlem where medlem_balance < 0;

    }
public void updateBetaling (int medlemID, int indbetaling){


}

    public void registrerBetaling() throws SQLException {
        System.out.println("Vælg medlemID der skal indbetale penge: ");
        Scanner scanner = new Scanner(System.in);
        int medlemID = scanner.nextInt();
        System.out.println("Hvor penge penge vil medlemmet indbetale?");
        int indbetaling = scanner.nextInt();

        String sql = "select medlem_balance from medlem where medlem_id = " + medlemID +";";
        Connection connection = JDBCConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery(sql);

        resultSet.next(); //before start of resultSet
        int nuværendeMedlemBalance = resultSet.getInt("medlem_balance");
        int nyBalance = nuværendeMedlemBalance + indbetaling;
        String sql1 = "Update medlem set medlem_balance = " + nyBalance + " where medlem_id = " + medlemID;
        preparedStatement = connection.prepareStatement(sql1);
        preparedStatement.executeUpdate();

    }
}
