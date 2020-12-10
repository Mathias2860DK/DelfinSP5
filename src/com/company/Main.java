package com.company;

import Controller.MainController;
import Exeptions.NoSuchMedlemExeption;

import java.io.IOException;
import java.sql.SQLException;



public class Main {

    public static void main(String[] args) throws SQLException, IOException, NoSuchMedlemExeption {
        MainController mainController = new MainController();
        mainController.runProgram();

    }
}
