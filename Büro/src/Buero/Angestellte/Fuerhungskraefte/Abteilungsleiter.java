package Buero.Angestellte.Fuerhungskraefte;

import Buero.Angestellte.Fuehrungskraft;

public class Abteilungsleiter extends Fuehrungskraft {
    // Konstruktor
    public Abteilungsleiter(String name, int sollZeit) {
        super(name, sollZeit);
    }

    // Methoden
    public void mitarbeiterBefoerdern() {
        System.out.println("Mitarbeiter wurde befördert!");
    }

}
