package Buero.Angestellte.Sachbearbeitende;

import Buero.Angestellte.Sachbearbeiter;

public class Verwaltung extends Sachbearbeiter {
    // Konstruktor
    public Verwaltung(String name, int sollZeit) {
        super(name, sollZeit);
    }

    // Methoden
    @Override
    public void datenEintragen() {
        System.out.println("Neuer Dozent im Register aufgenommen ...");
    }
    public void personalPlanen() {
        System.out.println("Die Einsatzpläne wurden erstellt!");
    }
    public void buchhaltung() {
        System.out.println("Neue Rechner sind abgeschrieben!");
    }
}
