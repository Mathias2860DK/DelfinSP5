package Controller;

import Handler.KassererHandler;
import UI.KassererMenu;

import java.sql.SQLException;
import java.util.Scanner;

public class KassererController {
    KassererMenu kassererMenu = new KassererMenu();
    KassererHandler kassererHandler = new KassererHandler();

    public void runProgram() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int exitValue = 9;

        while (choice != exitValue) {
            kassererMenu.printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    kassererHandler.seRestance();
                    break;
                case 2:
                    kassererHandler.registrerBetaling();
                    break;

            }
        }
    }
}
