import Bar.Getranke.Saefte.Apfelsaft;
import Bar.Getranke.Saefte.Kiwisaft;
import Bar.Getranke.Spirituosen.Tequila;
import Bar.Getranke.Spirituosen.Wodka;

public class Main {

    public static void main(String[] args) {
        // Objekte von Apfelsaft, Kiwisaft, Tequila und Wodka erstellen
        // GebeInfo aufrufen

        Apfelsaft apfel = new Apfelsaft(true, true, 250);
        Kiwisaft kiwi = new Kiwisaft(false, 500);
        Wodka wodka = new Wodka("Raspberry", 42, 750);
        Tequila tequila = new Tequila(false, 38, 400);

        apfel.gebeInfo();
        kiwi.gebeInfo();
        wodka.gebeInfo();
        tequila.gebeInfo();
    }
}
