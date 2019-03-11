package Buero.Angestellte.Sachbearbeitende;


import Buero.Angestellte.Sachbearbeiter;

public class Empfang extends Sachbearbeiter {
    // Konstruktor
    public Empfang(String name, int sollZeit) {
        super(name, sollZeit);
    }

    // Methoden
    public void begruessen() {
        System.out.println("Herzlich willkommen!");
    }
    public void telefonieren() {
        System.out.println("Nummer wird gewählt...");
    }
    @Override
    public void datenEintragen() {
        System.out.println("Teilnehmer in Liste eintragen ...");
    }

}
