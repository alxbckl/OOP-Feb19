package Zoo.Tiere.Hunde;

import Zoo.Tiere.Haustier;
import Zoo.Tiere.Hund;

public class BorderCollie extends Hund implements Haustier {
    // Hüte Schafe

    public void hueteSchafe() {
        // Bezeichner super vorne anstellen,
        // um klarzumachen, dass wir NICHT in der aktuellen Klasse suchen,
        // sondern in der Vererbungskette weiter oben.
        super.belle();
        System.out.println("Ich hüte deine Schafe!");
    }
}
