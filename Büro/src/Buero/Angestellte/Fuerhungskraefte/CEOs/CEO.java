package Buero.Angestellte.Fuerhungskraefte.CEOs;

import Buero.Angestellte.Fuerhungskraefte.Abteilungsleiter;

public class CEO extends Abteilungsleiter {
    // Konstruktor
    public CEO(String name, int sollZeit) {
        super(name, sollZeit);
    }

    // Methoden
    public void mitarbeiterEinstellen() {
        System.out.println("Neuer Mitarbeiter wurde eingestellt!");
    }
    public void mitarbeiterEntlassen() {
        System.out.println("Den brauchen wir nicht mehr! Kostet nur aber macht nichts...");
    }
}
