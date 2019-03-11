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

    @Override
    public void patientBehandeln(String name) {
        System.out.println("Ich nehme " + name + " zuerst Blut ab!");
    }

    @Override
    public void patientBehandeln(int anzahl) {
        System.out.println("Ich nehme " + anzahl + " mal Blut ab!");
    }



    void ratGeben() {

    }

    public boolean getMatchtHausbesuche() {
        return this.machtHausbesuche;
    }
}
