package Controller;

import Exeptions.NoSuchMedlemExeption;
import Handler.FormandHandler;
import UI.FormandMenu;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class FormandController {
    FormandMenu formandMenu = new FormandMenu();
    FormandHandler formandHandler = new FormandHandler();
Scanner scanner = new Scanner(System.in);
int choice = 0;
int exitValue = 9;

    public void runProgram() throws IOException, SQLException, NoSuchMedlemExeption {
while (choice != exitValue){
    formandMenu.printMenu();
    choice = scanner.nextInt();
    switch (choice){
        case 1:
            formandHandler.visMedlemmer();
            break;
        case 2:
            formandHandler.tilføjMedlem();
            break;
        case 3:
            formandHandler.fjernMedlem();




    }
}

    }
}
