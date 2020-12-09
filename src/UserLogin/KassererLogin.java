package UserLogin;

import Controller.KassererController;

import java.util.Scanner;

public class KassererLogin implements Login {
    KassererController kassererController = new KassererController();
    Scanner scanner = new Scanner(System.in);
    String correctUsername = "kasserer";
    String correctPassword = "kasserer123";
    String username = "";
    String password = "";
    @Override
    public void login() {
        System.out.println("Hvad er dit brugernavn?");
        username = scanner.nextLine();
        System.out.println("Hvad er dit password?");
        password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)){
            kassererController.runProgram();
            System.out.println("vi kom ind");
        } else {
            System.out.println("Forkert username eller password");
        }

    }

}
