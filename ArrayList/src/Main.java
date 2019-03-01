// ArrayList importieren
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // ArrayList ist flexibler als ein reines Array
        // Größe ist veränderbar
        // Kann alle Datentypen und Klassenaufnehmen


        // Zum Vergleich ein herkömmliches Array
        // String[] list = new String[6];

        // ArrayList<Datentyp> name = new ArrayList();
        // Liste deklarieren
        ArrayList<String> namen = new ArrayList();
        namen.add("Ali Anani");
        namen.add("Antonio Hägele");
        namen.add("Damit Ayane");
        namen.add("Ferhat Derin");
        namen.add("Hamza Findik");
        namen.add("Ingo Türke");

        // Liste ausgeben
        for(int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }

        // Leere Zeile
        System.out.println();

        // Objekte Entferen
        namen.remove(1);
        namen.remove(3);

        // Liste ausgeben
        for(int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }

        // Leere Zeile
        System.out.println();

        namen.add(1, "Antonio Hägele");
        namen.add(3, "Hamza Findik");

        // Liste ausgeben
        for(int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }

        // Leere Zeile
        System.out.println();

        // Liste durchsuchen

        // Jedes mal mit if prüfen, ob der Wert gefunden wurde, der gesucht war
        // Index auf der Konsole ausgeben
        // Mit einer For schleife durch die Liste gehen
        for(int i = 0; i < namen.size(); i++) {
            if(namen.get(i).equals("Ferhat Derin")) {
                System.out.println("Index: " + i);
                break;
            }
        }

        // Leere Zeile
        System.out.println();

        // Mit ausgelagerter Methode durchsuchen
        System.out.println(searchFor("Ferhat Derin", namen));
        System.out.println(searchFor("fjjl", namen));
    }

    // Nimmt einen Suchbegriff und eine ArrayListe in der gesucht werden soll an.
    // Gibt den Index zurück, wenn der Suchbegriff gefunden wurde
    // und -1, wenn er nicht gefunden wurde.
    static int searchFor(String search, ArrayList namen) {
        for(int i = 0; i < namen.size(); i++) {
            if(namen.get(i).equals(search)) {
                return i;
            }
        }

        return -1;
    }
}
