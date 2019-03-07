package Krankenhaus;

import Krankenhaus.Aerzte.Chirurg;

public abstract class Arzt {
    // Attribute / Instanzvariablen
    protected boolean arbeitetImKrankenhaus;
    protected String vorName, nachName;

    // Konstruktor - solle Name und Nachname annehemen
    public Arzt(String vorName, String nachName) {
        this.vorName = vorName;
        this.nachName = nachName;
    }

    public Arzt(int i) {

    }

    public Arzt(int i, int b) {

    }

    public Arzt() {

    }


    // Methoden
    public abstract void patientBehandeln();
    public abstract void patientBehandeln(String name);
    public abstract void patientBehandeln(int anzahl);

//    public void patientBehandeln() {
//        System.out.println("Ich bin in einer Behandlung!");
//    }
//
//    public void patientBehandeln(String name) {
//        System.out.println("Ich behandle den Patienten " + name);
//    }
//
//    public void patientBehandeln(int anzahl) {
//        System.out.println("Ich behandle gerade " + anzahl + " Patienten.");
//    }
//
//    public int patientBehandlen(int anzahl) {
//        System.out.println("Test rückgabe");
//        return anzahl;
//    }

    // Methoden schreiben:
    // schreibeRezept() - Ausgabe: Bitte Medikament und Dosierung angeben
    // schreibeRezept(String medikament) - Ausgabe: Bitte Dosierung angeben
    // schreibeRezept(String medikament, String dosierung) - Medikament und Dosierung ausgeben

    public void schreibeRezept() {
        System.out.println("Bitte Medikament und Dosierung angeben!");
    }
    public void schreibeRezept(String medikament) {
        System.out.println("Bitte Dosierung angeben!");
    }
    public void schreibeRezept(String medikament, String dosierung) {
        System.out.println("Sie bekommen das Medikament " + medikament +".");
        System.out.println("Bitte " + dosierung + " einnehmen!");
        System.out.println("Gute Besserung!");
    }

    // willkommen - Willkommen in der Praxis von Dr. Emmanuel Meyer
    public void willkommen() {
        System.out.println("Willkommen in der Praxis von " + this.vorName + " " + this.nachName + "!");
    }

    // Methode willkommen überladen -> String namen annemen und in die Ausgabe mit einbauen
    public void willkommen(String name) {
        System.out.println("Willkommen " + name + " in der Praxis von " + this.vorName + " " + this.nachName + "!");
    }


}
