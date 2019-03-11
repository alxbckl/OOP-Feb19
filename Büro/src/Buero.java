import Buero.Angestellte.Fuerhungskraefte.CEOs.CEO;
import Buero.Angestellte.ITler.Admin;
import Buero.Angestellte.Sachbearbeitende.Empfang;
import Buero.Angestellte.Sachbearbeitende.Verwaltung;
import Buero.Angestellter;

import java.util.Scanner;

public class Buero {
    // Attribute
    private CEO chef;
    private Admin administrator;
    private Empfang empfangEins;
    private Verwaltung verwaltungEins;
    private Scanner sc;

    // Konstruktor
    public Buero() {
        sc = new Scanner(System.in);
        System.out.print("Name des Chefs eigeben: ");
        this.chef = new CEO(sc.nextLine(), 40);
        this.administrator = new Admin("Max", 30);
        this.empfangEins = new Empfang("Maja", 25);
        this.verwaltungEins = new Verwaltung("Inge", 35);
    }


    // Zustandsautomat
    public void start() {
        // Hier ist unser Hauptprogramm!!
        empfangEins.komme();
        empfangEins.begruessen();
        empfangEins.datenEintragen();
        empfangEins.telefonieren();
        empfangEins.gehe();

        chef.komme();
        chef.gehe();

        // Von abstrakten Klassen können wir KEIN Objekt erstellen!
        // Angestellter test = new Angestellter("Max", 15);

    }

    // Methoden
    private void fuelleLeerzeichen(String ausgabe, int spaltenBreite) {
        for (int i = 0; i < spaltenBreite - ausgabe.length(); i++) {
            System.out.print(" ");
        }
    }

    private String leerZeichen(String ausgabe, int spaltenBreite) {
        String leerZeichen = "";
        for (int i = 0; i < spaltenBreite - ausgabe.length(); i++) {
            leerZeichen += " ";
        }

        return leerZeichen;
    }
}
