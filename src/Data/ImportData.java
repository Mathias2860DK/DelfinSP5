package Data;

import Domain.Medlem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Connection.JDBCConnector;
import Domain.Resultater;

public class ImportData {
    Medlem medlem = new Medlem();
    Resultater resultater = new Resultater();

    public List<Medlem> fillListWithMembers() throws SQLException {
        List<Medlem> medlemList = new ArrayList<>();
        //Medlem medlem = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * from delfin.medlem;";
        Connection connection = JDBCConnector.getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
int lappeLøsning = 0;
        while (resultSet.next()) {
            String navn = resultSet.getString("navn");
            int aargang = resultSet.getInt("aargang");
            String status = resultSet.getString("medlem_status");
            String gruppe = resultSet.getString("medlem_gruppe");
            String type = resultSet.getString("medlem_type");
            int balance = resultSet.getInt("medlem_balance");
            String gender = resultSet.getString("gender");
            //int id, String name, int aargang, String medlemsStatus, String medlemsGruppe, String medlemsType, int medlemsBalance, String gender
            int medlemid = resultSet.getInt(1);
            medlem = new Medlem(medlemid,navn,aargang,status,gruppe,type,balance,gender);
            medlemList.add(medlem);
        }
        return medlemList;
    }

    public List <Resultater>  fillListWithResults() throws SQLException {
        List <Resultater> resultaterList = new ArrayList<>();
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * from delfin.results;";
        Connection connection = JDBCConnector.getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int result_id = resultSet.getInt("result_id");
            int medlem_id = resultSet.getInt("medlem_id");
            int stilart_id = resultSet.getInt("stilart_id");
            int result = resultSet.getInt("result");
            Timestamp time = resultSet.getTimestamp("time");
            //int medlem_id, int stilart_id, int result, Timestamp result_time
            resultater = new Resultater(medlem_id,stilart_id,result_id,time);
            resultaterList.add(resultater);

        }
        return resultaterList;
    }

}
