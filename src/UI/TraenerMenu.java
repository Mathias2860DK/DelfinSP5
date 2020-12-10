package UI;

public class TraenerMenu implements UI{
    @Override
    public void printMenu (){
        System.out.println("1) Vis medlemmer");
        System.out.println("2) Tilføj medlemmer");
        System.out.println("3) Fjern medlem");
        System.out.println("9) Afslut");
    }
}
