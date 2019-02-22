public class Main {

    public static void main(String[] args) {
        // Erstellen Sie eine neue Klasse Auto
        // Attribute: String marke, String modell, String farbe
        // Davon ein Objekt AudiA4
        // Objekt BMW3er
        // Objekt AudiA6


        // Erstellen von Objekten
        Auto AudiA4 = new Auto();
        Auto BMW3er = new Auto();
        Auto AudiA6 = new Auto();

        AudiA4.marke = "Audi";
        AudiA4.modell= "A4";
        AudiA4.farbe = "blau";
        AudiA4.serienNummer = "FZG7839038";
        AudiA4.tankVolumen = 64;
        AudiA4.verbrauch = 6.3;

        BMW3er.marke = "BMW";
        BMW3er.modell ="3er";
        BMW3er.farbe = "schwarz";
        BMW3er.serienNummer = "B3393788";
        BMW3er.tankVolumen = 72;
        BMW3er.verbrauch = 8.4;

        AudiA6.marke = "Audi";
        AudiA6.modell = "A6";
        AudiA6.farbe = "rot";
        AudiA6.serienNummer = "A4823D8";
        AudiA6.verbrauch = 7.8;
        AudiA6.tankVolumen = 82;

        System.out.println("In meiner Garage steht ...");
        System.out.println("... ein " + AudiA4.farbe + "er " + AudiA4.marke + " " + AudiA4.modell);
        System.out.println("... ein " + BMW3er.farbe + "er " + BMW3er.marke + " " + BMW3er.modell);
        System.out.println("... ein " + AudiA6.farbe + "er " + AudiA6.marke + " " + AudiA6.modell);

        AudiA4.druckeInfo();
        BMW3er.druckeInfo();
        AudiA6.druckeInfo();
    }
}
