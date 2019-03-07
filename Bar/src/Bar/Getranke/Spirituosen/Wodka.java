package Bar.Getranke.Spirituosen;

import Bar.Getranke.Spirituose;

public class Wodka extends Spirituose {
    // Attribute
    private String aroma;

    // Konstruktor
    public Wodka(String aroma, double alkoholGehalt, int volumen) {
        // Konstruktor der Superklasse aufrufen
        super(alkoholGehalt, volumen);

        // Aroma setzen
        this.aroma = aroma;
    }

    @Override
    public void gebeInfo() {
        System.out.println(
                "Dieser " + this.aroma + "-Wodka hat " +
                super.alkoholGehalt + "% Alkoholgehalt.");

        System.out.println("Das Volumen beträgt " + super.volumen + "ml.");
    }
}
