package Bar.Getranke.Saefte;

import Bar.Getranke.Saft;

public class Kiwisaft extends Saft {
    // Konstruktor
    public Kiwisaft(boolean hatFruchtFleisch, int volumen) {
        // Konstruktor der Superklasse aufrufen
        super(hatFruchtFleisch, volumen);
    }

    // Methoden
    @Override
    public void gebeInfo() {
        // Dieser Apfelssfat ist naturtrüb
        // Dieser Apfelsaft ist klar
        System.out.println(
                "Dieser Kiwisaft hat " +
                (super.hatFruchtFleisch ? "" : "kein") +
                " Fruchtfleisch.");

        System.out.println("Das Volumen beträgt " + super.volumen + "ml.");
    }
}
