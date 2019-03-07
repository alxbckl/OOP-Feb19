package Bar.Getranke;

import Bar.Getraenk;

public abstract class Saft extends Getraenk {
    // Attribute
    protected boolean hatFruchtFleisch;

    // Konstruktor
    public Saft(boolean hatFruchtFleisch, int volumen) {
        // Konstruktor der Superklasse aufrufen
        super(volumen);

        // Setzen wir hatFruchtFleisch
        this.hatFruchtFleisch = hatFruchtFleisch;
    }

    // Methoden
    public void schuetteln() {}

    public boolean getHatFruchtFleisch() {
        return this.hatFruchtFleisch;
    }
}
