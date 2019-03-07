package Bar;

public abstract class Getraenk {
    // Attribute
    protected int volumen;

    // Konstruktor
    public Getraenk(int volumen) {
        this.volumen = volumen;
    }

    // Methoden
    public int getVolumen() {
        return volumen;
    }

    public abstract void gebeInfo();
}
