public class Buero {



    // Methoden
    public void fuelleLeerzeichen(String ausgabe, int spaltenBreite) {
        for (int i = 0; i < spaltenBreite - ausgabe.length(); i++) {
            System.out.print(" ");
        }
    }
}
