public class Buero {
    // Attribute


    // Konstruktor


    // Zustandsautomat



    // Methoden
    private void fuelleLeerzeichen(String ausgabe, int spaltenBreite) {
        for (int i = 0; i < spaltenBreite - ausgabe.length(); i++) {
            System.out.print(" ");
        }
    }

    private String leerZeichen(String ausgabe, int spaltenBreite) {
        String leerZeichen = "";
        for (int i = 0; i < spaltenBreite - ausgabe.length(); i++) {
            leerZeichen += " ";
        }

        return leerZeichen;
    }
}
