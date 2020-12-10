package Handler;

import Data.ImportData;
import Domain.Medlem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public void registrerBetaling() {

    }
}
