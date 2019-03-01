// Scanner einbinden

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Zwei neue Objekte erzeugen jeder Klasse erzeugen
        Rectangle rect1 = new Rectangle("Garten");
        Rectangle rect2 = new Rectangle("Wohnzimmer");

        Triangle tri1 = new Triangle("Pyramide");
        Triangle tri2 = new Triangle("Treppe");

        // Für jedes Objekt die Attribute einlesen
        rect1.readAttributes();
        rect2.readAttributes();

        tri1.readAttributes();
        tri2.readAttributes();

        // Rechtecke und Dreiecke ausgeben
        rect1.printRectangle();
        rect2.printNonFilledRectangle();

        tri1.printTriangleCentered();
        tri2.printTriangleRight();
    }
}
