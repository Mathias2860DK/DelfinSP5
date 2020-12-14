package UI;

public class TraenerMenu implements UI{
    @Override
    public void printMenu (){
        System.out.println("1) Tildel stilart(er) for et medlem");
        System.out.println("2) Tilføj træningsresultat for et medlem");
        System.out.println("3) Vis bedste træningsresultat i alle dicipliner"); //Viser de enkelte medlememers bedste resultat i alle tilmeldte dicipliner.
        System.out.println("4) Tilføj konkurrence resultat"); //stævne, placering og tid (hvilken diciplin).
        System.out.println("5) Vis top 5 svømmere indenfor hver diciplin - Senior"); //senior som arguemnt
        System.out.println("5) Vis top 5 svømmere indenfor hver diciplin - Junior"); // junior som argument
        System.out.println("9) Afslut");
    }

    public void printStilarter(){
        System.out.println("1) tilføj crawl");
        System.out.println("2) Tilføj ryg");
        System.out.println("3) Tilføj bryst");
        System.out.println("4) Tilføj butterfly");
        System.out.println("9) for exit (ikke flere stilarter skal tilføjes");
    }
}
