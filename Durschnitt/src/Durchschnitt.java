public class Durchschnitt {
    // Attribute
    double[] noten = {1.7, 2.7, 3.3, 3.7, 5.0, 2.7, 2.3, 1.7, 2.0, 1.7, 1.0, 2.3, 3.3, 1.7, 3.3, 4.3, 2.3, 2.7, 1.3, 3.0, 2.7};
    double durchschnitt = 0;

    // Methoden
    void berechneDurschnitt() {
        for(int i = 0; i < noten.length; i++) {
            durchschnitt += noten[i];
        }

        durchschnitt /= noten.length;
        // Kurzschreibweise von:
        // durschnitt = durchschnitt / noten.length;
    }

    void druckeDurschnitt() {
        System.out.printf("Der Durschnitt der Klausur beträgt: %.1f", durchschnitt);
    }
}
