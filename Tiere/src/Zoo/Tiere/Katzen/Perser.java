package Zoo.Tiere.Katzen;

import Zoo.Tiere.Katze;
import Zoo.Tiere.Haustier;

public class Perser extends Katze implements Haustier{
    public void geheRaus() {
        System.out.println("Bis später ;)");
    }

    // Methoden aus Interface übernehmen
    public void macheMaennchen() {
        System.out.println("Katze macht Männchen!");
    }

    public void willLeckerli() {
        System.out.println("Gib mir Whiskas ;)");
    }

    public void kraulenLassen() {
        System.out.println("Schnurr Schnurr");
    }

    public String gebeName() {
        return "Kitti";
    }

}
