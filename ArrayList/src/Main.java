// ArrayList importieren
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // ArrayList ist flexibler als ein reines Array
        // Größe ist veränderbar
        // Kann alle Datentypen und Klassenaufnehmen

        // ArrayList<Datentyp> name = new ArrayList();
        ArrayList<String> liste = new ArrayList();

        // Zum Vergleich ein herkömmliches Array
        String[] list = new String[6];

        // Neue Einträge ergänzen
        liste.add("Hallo");
        liste.add("Welt");
        liste.add("!");
        liste.add("Wie");
        liste.remove(2);
        liste.add(1, "Test");

        // Gibt die komplette liste aus
        System.out.println(liste);

        // Gibt die komplette liste auf unserem bisherigen Weg aus
        for(int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i));
        }



    }
}
