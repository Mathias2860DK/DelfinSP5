package Handler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connection.JDBCConnector;
import Domain.Medlem;
import Exeptions.NoSuchMedlemExeption;

public class MedlemHandler {

//Vi bruger ikke denne metode
    public Medlem getMedlemById(int id) throws SQLException, NoSuchMedlemExeption {
        Medlem retVal = null;
        Connection connection = JDBCConnector.getConnection();
        String sql = "SELECT medlem_id from medlem where medlem_id = " + id + ";";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.executeQuery();
        //updateOrdreStatus(id);

        if (retVal == null){
            throw new NoSuchMedlemExeption(id +" er ikke et gyldigt id");

        }
        return retVal;

    }

}
