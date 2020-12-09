package Handler;

import Data.EksportData;
import Data.ImportData;
import Domain.Medlem;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class FormandHandler {

    public void tilføjMedlem() throws IOException, SQLException {
        Medlem medlem = new Medlem();
        EksportData eksportData = new EksportData();
        String name = "";
        int aargang = 0;
        //String medlemsStatus = "";
        //String medlemsGruppe = "";
        String medlemsType= "";
        int medlemsBalance = 0;
        String gender= "";
        int medlemChoice = 0;
        Date dateNow = new Date();
        int currentYear = dateNow.getYear() + 1900;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Du tilføjer nu et nyt medlem! Hvad er navnet på det nye medlem?");
        name = scanner.nextLine();
        medlem.setName(name);

        //sætter gender
        System.out.println("Er du en mand eller en kvinde? ");
        medlemChoice = scanner.nextInt();
        if (medlemChoice == 1) {
            medlem.setGender("Mand");
        } else if (medlemChoice == 2){
            medlem.setGender("Kvinde");
        }


        System.out.println("Hvilket årstal er medlemmet født?");
        aargang = scanner.nextInt();
        medlem.setAargang(aargang);

        System.out.println("Medlemstype: Tast 1 for aktiv, Tast 2 for passiv-medlemskab ");
        medlemChoice = scanner.nextInt();
        if (medlemChoice == 1) {
            medlem.setMedlemsStatus("Aktiv");
        }else if (medlemChoice == 2){
            medlem.setMedlemsStatus("Passiv");
        }

        //sæt medlemsGruppe
        int memberAge = currentYear - aargang;
        if (memberAge >= 18) {
            medlem.setMedlemsGruppe("Senior");
        }else if (memberAge < 18){
            medlem.setMedlemsGruppe("Junior");
        }

        //sæt medlemsType
        System.out.println("MedlemsType: Tast 1 for Motionist, Tast 2 for konkurrence svømmer");
        medlemChoice = scanner.nextInt();
        if (medlemChoice == 1) {
            medlem.setMedlemsType("Motionist");
        }else if (medlemChoice == 2){
            medlem.setMedlemsType("Konkurrence svømmer");
        }
        //sæt medlemsBalance
        int kontigentAktivUnder18 = 1000;
        int kontigentAktivOver18 = 1600;
        int kontigentAktivOver60 = 1600/100*25; //25% rabat for folk over 60
        int kontigentPassiv = 500;

        if (medlem.getMedlemsStatus().equals("Aktiv") && memberAge < 18){
            medlemsBalance -= kontigentAktivUnder18;
            medlem.setMedlemsBalance(medlemsBalance);
        } else if (medlem.getMedlemsStatus().equals("Aktiv") && memberAge >= 18){
            medlemsBalance -= kontigentAktivOver18;
            medlem.setMedlemsBalance(medlemsBalance);
        } else if (medlem.getMedlemsStatus().equals("Aktiv") && memberAge >= 60 ){
            medlemsBalance -= kontigentAktivOver60;
            medlem.setMedlemsBalance(medlemsBalance);
        } else if (medlem.getMedlemsStatus().equals("Passiv")){
            medlemsBalance -= kontigentPassiv;
            medlem.setMedlemsBalance(medlemsBalance);
        }
int medlemID = eksportData.saveOrder(medlem);
        medlem.setId(medlemID);

    }
ImportData importData = new ImportData();
    public void visMedlemmer() throws SQLException {
        System.out.println(importData.fillListWithData());
    }
}
