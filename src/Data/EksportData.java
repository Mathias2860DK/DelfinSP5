package Data;

import Domain.Medlem;
import Connection.JDBCConnector;

import java.io.IOException;
import java.sql.*;

public class EksportData {
    public int saveOrder(Medlem medlem) throws IOException, SQLException {
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
}


