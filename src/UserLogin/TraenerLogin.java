package UserLogin;

import Controller.TraenerController;

import java.sql.SQLException;
import java.util.Scanner;

public class TraenerLogin implements Login {
    TraenerController traenerController = new TraenerController();
    Scanner scanner = new Scanner(System.in);
    String correctUsername = "traener";
    String correctPassword = "traener123";
    String username = "";
    String password = "";
    @Override
    public void login() throws SQLException {
        System.out.println("Hvad er dit brugernavn?");
        username = scanner.nextLine();
        System.out.println("Hvad er dit password?");
        password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)){
            traenerController.runProgram();
            System.out.println("vi kom ind");
        } else {
            System.out.println("Forkert username eller password");
        }

    }

}
