package Data;

import Domain.Medlem;
import Connection.JDBCConnector;
import Domain.Resultater;

import java.io.IOException;
import java.sql.*;

public class EksportData {
    public int saveMedlem(Medlem medlem) throws IOException, SQLException {
        int medlem_Id = 0;
        ResultSet rs = null;
        Connection connection = JDBCConnector.getConnection();
        String query = " INSERT INTO medlem (navn, aargang, medlem_status, medlem_gruppe, medlem_type, medlem_balance, gender)"
                + " values (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, medlem.getName());
        preparedStatement.setInt(2, medlem.getAargang());
        preparedStatement.setString(3, medlem.getMedlemsStatus());
        preparedStatement.setString(4, medlem.getMedlemsGruppe());
        preparedStatement.setString(5, medlem.getMedlemsType());
        preparedStatement.setInt(6,medlem.getMedlemsBalance());
        preparedStatement.setString(7, medlem.getGender());
        preparedStatement.executeUpdate();
        //TODO : fetch orderID from order table
        rs = preparedStatement.getGeneratedKeys();
        if (rs.next()) {
            medlem_Id = rs.getInt(1);
        }
        return medlem_Id;
    }
    public void saveResult(Resultater resultater) throws SQLException {
        ResultSet rs = null;
        Connection connection = JDBCConnector.getConnection();
        String query = " INSERT INTO results (medlem_id, stilart_id, result, result_time)"
                + " values (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,resultater.getMedlem_id());
        preparedStatement.setInt(2,resultater.getStilart_id());
        preparedStatement.setInt(3,resultater.getResult());
        preparedStatement.setTimestamp(4,resultater.getResult_time());
        preparedStatement.executeUpdate();
    }

}


