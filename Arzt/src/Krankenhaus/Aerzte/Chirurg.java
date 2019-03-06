package Krankenhaus.Aerzte;

// Arzt einbinden
import Krankenhaus.Arzt;

public class Chirurg extends Arzt {
    // Attribute


    // Konstruktor
    public Chirurg(String vorName, String nachName) {
        super(vorName, nachName);
    }

    public Chirurg(int i, int b) {

    }



    // Methoden
    @Override
    public void patientBehandeln() {
        System.out.println("Ich operiere!");
    }

    @Override
    public void patientBehandeln(String name) {
        System.out.println("Test");
    }
    public void schneiden() {

    }

    // Methode überschreiben
    // schreibeRezept(String medikament, String dosierung) - Medikament und Dosierung ausgeben und an Apotheke verweisen
    @Override
    public void schreibeRezept(String medikament, String dosierung) {
        super.schreibeRezept(medikament, dosierung);
        System.out.println("Bitte zur nächsten Apotheke gehen!");
    }

    // willkommen überschreiben -> Willkommen im Marienhospital - Dr. Emmanuel Meyer wird sie operieren!
    @Override
    public void willkommen() {
        System.out.println("Willkommen im Marienhospital - Dr. " + super.vorName + " " + super.nachName + " wird Sie behandeln!");
    }
}
