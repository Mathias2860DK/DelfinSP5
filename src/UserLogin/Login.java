package UserLogin;

import Exeptions.NoSuchMedlemExeption;

import java.io.IOException;
import java.sql.SQLException;

public interface Login {
    void login() throws IOException, SQLException, NoSuchMedlemExeption;

}
