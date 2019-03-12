package Zoo.Tiere;

// Tier einbinden

import Zoo.Tier;

public class Katze extends Tier {
    public String personal;
    public String krallen;
    public String verhalten;

    public void miau() {
        System.out.println("Miau!");
    }
    public void schnurren() {
        System.out.println("Schnurr Schnurr!");
    }
}
