package Buero.Angestellte;

import Buero.Angestellter;

public abstract class IT extends Angestellter {
    // Konstruktor
    public IT(String name, int sollZeit) {
        super(name, sollZeit);
    }

    // Methoden
    public abstract void reparieren();
}
