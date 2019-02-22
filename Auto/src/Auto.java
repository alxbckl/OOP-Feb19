public class Auto {
    // Attribute
    String marke;
    String modell;
    String farbe;
    String serienNummer;

    double tankVolumen;     // Angabe in l
    double verbrauch;       // Angabe in l / 100km
    double tankStand;



    // Methoden
    // Berechnung der Reichweite
    double gebeMaxReichweite() {
        return tankVolumen / verbrauch * 100;
    }
    // Tankvolumen / Verbrauch * 100
    // 30l / 6l/100km * 100 = 500km

    void druckeInfo() {
        System.out.printf("Der " + this.farbe + "e " + this.marke + " " + this.modell +  " kommt " + "%.0f" + "km weit.\n", this.gebeMaxReichweite());
        System.out.println("Die Seriennummer lautet " + this.serienNummer);
    }

    double gebeAktReichweite() {
        return tankStand / verbrauch * 100;
    }

    // fahre(Anzahl km)
    // Soll berechen, wie viel Liter die gefahrene Strecke benötigt
    // Und diesen Wert vom tankStand abziehen.

    // tanke(Anzahl an litern)
    // Die Liter sollen dem Tankstand hinzugefügt werden

}
