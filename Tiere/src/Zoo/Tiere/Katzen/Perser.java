package Zoo.Tiere.Katzen;

import Zoo.Tiere.Katze;
import Zoo.Tiere.Haustier;

public class Perser extends Katze implements Haustier{
    public void geheRaus() {
        System.out.println("Bis später ;)");
    }

    // Methoden aus Interface übernehmen
    public void macheMaennchen() {
        System.out.println("Hund macht Männchen!");
    }

}
