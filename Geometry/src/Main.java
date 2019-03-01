// ArrayListe einbinden
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        // Zwei neue Objekte erzeugen jeder Klasse erzeugen
//        Rectangle rect1 = new Rectangle("Garten");
//        Rectangle rect2 = new Rectangle("Wohnzimmer");
//
//        Triangle tri1 = new Triangle("Pyramide");
//        Triangle tri2 = new Triangle("Treppe");
//
//        // Für jedes Objekt die Attribute einlesen
//        rect1.readAttributes();
//        rect2.readAttributes();
//
//        tri1.readAttributes();
//        tri2.readAttributes();
//
//        // Rechtecke und Dreiecke ausgeben
//        rect1.printRectangle();
//        rect2.printNonFilledRectangle();
//
//        tri1.printTriangleCentered();
//        tri2.printTriangleRight();

        // ArrayList aus Objekten erstellen
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

        // Neues Objekt der Liste hinzufügen
        triangles.add(new Triangle("Pyramide"));
        triangles.add(new Triangle("Treppe"));

        rectangles.add(new Rectangle("Garten"));
        rectangles.add(new Rectangle("Wohnzimmer"));

        // Zugriff auf ein Objekt aus der Liste
        // 1. Objekt aus der Liste holen
        // 2. Zugriff auf das Objekt (und damit dessen Methoden)
        triangles.get(0).readAttributes();
        triangles.get(1).readAttributes();

        rectangles.get(0).readAttributes();
        rectangles.get(1).readAttributes();

        rectangles.get(0).printRectangle();
        rectangles.get(1).printNonFilledRectangle();

        triangles.get(0).printTriangleCentered();
        triangles.get(1).printTriangleRight();
    }
}
