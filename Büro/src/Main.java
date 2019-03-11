public class Main {

    public static void main(String[] args) {
        /*String ausgabe = "12";
        String leerZeichen = ""; // Wir wollen an der 10. Stelle anfangen
        for (int i = 0; i < 15 - ausgabe.length(); i++) {
            leerZeichen += " ";
        }

        System.out.println(ausgabe + leerZeichen + "Test");

        ausgabe = "Halloaaa";
        leerZeichen = "";
        for (int i = 0; i < 15 - ausgabe.length(); i++) {
            leerZeichen += " ";
        }

        System.out.println(ausgabe + leerZeichen + "Test");*/

        String output = "djkldasdfjsk";
        System.out.print(output);
        fuelleLeerzeichen(output, 20);
        System.out.println("Test");
        output = "jdkaslfjdasfj";
        System.out.print(output + leerZeichen(output, 20) + "Test");
    }

    public static void fuelleLeerzeichen(String ausgabe, int spaltenBreite) {
        for (int i = 0; i < spaltenBreite - ausgabe.length(); i++) {
            System.out.print(" ");
        }
    }

    public static String leerZeichen(String ausgabe, int spaltenBreite) {
        String leerZeichen = "";
        for (int i = 0; i < spaltenBreite - ausgabe.length(); i++) {
            leerZeichen += " ";
        }

        return leerZeichen;
    }
}
