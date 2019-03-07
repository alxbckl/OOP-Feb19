import Krankenhaus.Aerzte.Chirurg;
import Krankenhaus.Aerzte.Hausarzt;
import Krankenhaus.Arzt;

public class Main {

    public static void main(String[] args) {
        // Neues Objekt erstellen von Chirurg und Hausarzt
        Hausarzt drJakob = new Hausarzt("Stephan", "Jakob");
        Chirurg drMeyer = new Chirurg("Emmanuel", "Meyer");

        // Auf Attribut arbeitetImKrankenhaus zugreifen
        // drJakob.arbeitetImKrankenhaus = true;
        // Wollen wir eigentlich nicht

        drJakob.willkommen();
        drMeyer.willkommen();

        System.out.println();

        drJakob.patientBehandeln();
        drMeyer.patientBehandeln();

        // Von abstrakten Klassen kann KEIN Objekt erstellt werden
        // Arzt test = new Arzt();


    }
}
