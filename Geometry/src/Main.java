// Scanner einbinden
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ein Objekt vom Scanner erstellen
        Scanner input = new Scanner(System.in);
        // Ein neues Objekt erzeugen
        Rectangle rect1 = new Rectangle("DIN A4");
        Rectangle rect2 = new Rectangle("Schwimmbad");
        Rectangle rect3 = new Rectangle("Grundfläche");
        Rectangle rect4 = new Rectangle("Garten");

        // Attribute setzen
        rect1.readAttributes();
        rect2.readAttributes();
        rect3.readAttributes();
        rect4.readAttributes();

        // Rechteck zeichnen - Methoden ausführen
        rect1.printRectangle();
        rect1.printWidthLength();

        rect2.printRectangle();
        rect2.printWidthLength();

        rect3.printRectangle();
        rect3.printWidthLength();

        rect1.printNonFilledRectangle();
    }
}
