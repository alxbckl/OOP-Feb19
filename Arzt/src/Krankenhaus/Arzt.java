package Krankenhaus;

public class Arzt {
    // Attribute / Instanzvariablen
    protected boolean arbeitetImKrankenhaus;

    // Methoden
    public void patientBehandeln() {
        System.out.println("Ich bin in einer Behandlung!");
    }

    public void patientBehandeln(String name) {
        System.out.println("Ich behandle den Patienten " + name);
    }

    public void patientBehandeln(int anzahl) {
        System.out.println("Ich behandle gerade " + anzahl + " Patienten.");
    }

    
}
