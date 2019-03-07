package Krankenhaus.Aerzte;

// Arzt einbinden
import Krankenhaus.Arzt;


public class Hausarzt extends Arzt{
    // Attribute
    private boolean machtHausbesuche;

    // Konstruktor
    public Hausarzt(String vorName, String nachName) {
        super(vorName, nachName);
    }

    // Methode
    @Override
    public void patientBehandeln() {
        System.out.println("Ich nehme Ihnen zuerst Blut ab!");
    }


    void ratGeben() {

    }

    public boolean getMatchtHausbesuche() {
        return this.machtHausbesuche;
    }
}
