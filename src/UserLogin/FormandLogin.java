package UserLogin;

import Controller.FormandController;
import UserLogin.Login;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class FormandLogin implements Login {
FormandController formandController = new FormandController();
Scanner scanner = new Scanner(System.in);
String correctUsername = "formand";
String correctPassword = "formand123";
String username = "";
String password = "";
    @Override
    public void login() throws IOException, SQLException {
        System.out.println("Hvad er dit brugernavn?");
        username = scanner.nextLine();
        System.out.println("Hvad er dit password?");
        password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)){
            formandController.runProgram();
            System.out.println("vi kom ind");
        } else {
            System.out.println("Forkert username eller password");
        }

    }
}
