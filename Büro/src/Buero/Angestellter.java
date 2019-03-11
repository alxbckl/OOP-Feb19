package Buero;

public abstract class Angestellter {
    // Attribute
    private String name;
    private int sollZeit;

    // Konstruktor
    public Angestellter(String name, int sollZeit) {
        this.name = name;
        this.sollZeit = sollZeit;
    }

    // Methoden
    public void komme() {
        System.out.println(this.name + " ist zur Arbeit gekommen!");
    }

    public void gehe() {
        System.out.println(this.name + " ist nach Hause gegangen!");
    }
}
