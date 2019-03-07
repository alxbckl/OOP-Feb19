package Bar.Getranke.Spirituosen;

import Bar.Getranke.Spirituose;

public class Tequila extends Spirituose {
    // Attribute
    private boolean silber;

    // Konstruktor
    public Tequila(boolean silber, double alkoholGehalt, int volumen) {
        // Konstruktor der Superklasse aufrufen
        super(alkoholGehalt, volumen);

        // Setzen silber
        this.silber = silber;
    }

    // Methoden
    public boolean isSilber() {
        return silber;
    }

    @Override
    public void gebeInfo() {
        // Dieser Apfelssfat ist naturtrüb
        // Dieser Apfelsaft ist klar
        System.out.println(
                "Dieser Tequila ist " +
                (this.silber ? "silber" : "gold") +
                " und hat " + super.alkoholGehalt +
                "% Alkoholgehalt.");

        System.out.println("Das Volumen beträgt " + super.volumen + "ml.");
    }
}
