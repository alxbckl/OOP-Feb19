package Buero.Angestellte.ITler;

import Buero.Angestellte.IT;

public class Admin extends IT {
    // Konstruktor
    public Admin(String name, int sollZeit) {
        super(name, sollZeit);
    }

    // Methoden
    @Override
    public void reparieren() {
        System.out.println("Das Netzteil wurde endlich ausgetauscht!");
    }
    public void anwenderSchulen() {
        System.out.println("PC am Einschaltknopf einschalten ;)");
    }
    public void userAnlegen() {
        System.out.println("Ach... noch einer...");
    }
    public void netzwerkEinrichten() {
        System.out.println("Richtige Kabel in die richtige Dose stecken ;)");
    }
}
