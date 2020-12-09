package Data;

import Domain.Medlem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Connection.JDBCConnector;

public class ImportData {
    Medlem medlem = new Medlem();

    public List<Medlem> fillListWithData() throws SQLException {
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
    //List <Medlem>

}
