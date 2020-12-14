package Controller;

import Domain.Medlem;
import Handler.TraenerHandler;
import UI.TraenerMenu;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TraenerController {
    TraenerMenu traenerMenu = new TraenerMenu();
    TraenerHandler traenerHandler = new TraenerHandler();

    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    int exitValue = 9;
    /*  System.out.println("4) Tilføj konkurrence resultat"); //stævne, placering og tid (hvilken diciplin).
        System.out.println("5) Vis top 5 svømmere indenfor hver diciplin - Senior"); //senior som arguemnt
        System.out.println("5) Vis top 5 svømmere indenfor hver diciplin - Junior"); // junior som argument*/
    public void runProgram() throws SQLException {

        while (choice != exitValue) {
            traenerMenu.printMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    traenerHandler.tildelStilart();
                    break;
                case 2:
                    traenerHandler.tilføjtræningsresultat();
                    break;
                case 3:
                    traenerHandler.bedsteTræningsResultat();
                    break;
                case 4:
                    //traenerHandler.tilføjKonkurrenceResultat();
                    break;
                case 5:
                    //traenerHandler.top5(List<junior>);
                    break;
                case 6:
                    //traenerHandler.top5(senior);


            }
        }

    }
}


