package Tiere;

// Superklasse Tier einbinden
import Tier;

// Hund von Tier erben lassen => extends Tier
public class Hund extends Tier {
    // Attribute
    public String herrechen;
    public String verhalten;

    // Methoden
    public void belle() {
        System.out.println("Wuff wuff!");
    }
    public void aportieren() {
        System.out.println("Ich bringe den Stock!");
    }

    public void machMaennchen() {
        System.out.println("Ich mache Männchen!");
    }
}
