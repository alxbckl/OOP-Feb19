package Krankenhaus.Aerzte;

// Arzt einbinden
import Krankenhaus.Arzt;

public class Chirurg extends Arzt {
    // Attribute

    // Methoden
    public void patientBehandeln() {
        super.arbeitetImKrankenhaus = false;
    }
    public void schneiden() {

    }
}
