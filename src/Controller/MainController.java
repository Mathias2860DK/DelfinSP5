package Controller;

import Exeptions.NoSuchMedlemExeption;
import UserLogin.FormandLogin;
import UserLogin.KassererLogin;
import UserLogin.TraenerLogin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainController {

    FormandLogin formandLogin = new FormandLogin();
    KassererLogin kassererLogin = new KassererLogin();
    TraenerLogin traenerLogin = new TraenerLogin();
    int choice = 0;
    Scanner scanner = new Scanner(System.in);
    public void runProgram() throws IOException, SQLException, NoSuchMedlemExeption {

        while (choice != 9) {
            System.out.println("Er du formand tast 1 kassere tast 2 træner tast 3");
            choice = scanner.nextInt();
            if (choice == 1 ){
                formandLogin.login();
            } else if (choice == 2) {
                kassererLogin.login();
            } else if (choice == 3) {
                traenerLogin.login();
            } else {
                System.out.println("Vælg et gyldigt tal");
                runProgram();
            }
        }
    }
}


