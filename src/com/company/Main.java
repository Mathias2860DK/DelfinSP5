package com.company;

import Controller.MainController;

import java.io.IOException;
import java.sql.SQLException;



public class Main {

    public static void main(String[] args) throws SQLException, IOException {
        MainController mainController = new MainController();
        mainController.runProgram();

    }
}
