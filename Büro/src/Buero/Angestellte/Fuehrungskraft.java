package Buero.Angestellte;

import Buero.Angestellter;

public abstract class Fuehrungskraft extends Angestellter {
    // Konstruktor
    public Fuehrungskraft(String name, int sollZeit) {
        super(name, sollZeit);
    }

    // Methoden
    public void delegieren() {
        System.out.println("Das machst du!");
    }
}
