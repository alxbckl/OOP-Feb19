package Krankenhaus.Aerzte;

// Arzt einbinden
import Krankenhaus.Arzt;

public class Chirurg extends Arzt {
    // Attribute

    // Methoden
    @Override
    public void patientBehandeln() {
        System.out.println("Ich operiere!");
    }
    public void schneiden() {

    }
}
