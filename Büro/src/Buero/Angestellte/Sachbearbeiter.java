package Buero.Angestellte;


import Buero.Angestellter;

public abstract class Sachbearbeiter extends Angestellter {
    // Konstruktor
    public Sachbearbeiter(String name, int sollZeit) {
        super(name, sollZeit);
    }

    // Methoden
    public abstract void datenEintragen();
}