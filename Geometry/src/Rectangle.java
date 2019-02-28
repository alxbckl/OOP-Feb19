// Scanner einbinden
import java.util.Scanner;

public class Rectangle {
    // Attribute - können mit this.attributName angesprochen werden
    private int length;
    private int width;
    private int borderWidth;
    private String name;
    Scanner input = new Scanner(System.in);

    // Konstruktor
    public Rectangle(String name) {
        this.name = name;
    }

    // Methoden
    public void printRectangle() {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void printNonFilledRectangle() {
        // Erste Zeile
        for (int i = 1; i <= borderWidth; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        // 2. - vorletzte Zeile
        for (int i = 1; i <= length - borderWidth * 2; i++) {
            // Rahmen Teil 1 - Teil vor der Aussparung
            for (int k = 1; k <= borderWidth; k++) {
                System.out.print("# ");
            }
            // Aussparung
            for (int j = 1; j <= width - 2 * borderWidth; j++) {
                System.out.print("  ");
            }
            // Rahemen Teil 2 - Teil nach der Aussparung
            for (int k = 1; k <= borderWidth; k++) {
                System.out.print("# ");
            }
            // Zeilenumbruch am Ende der Zeile
            System.out.println();
        }
        // Letzte Zeile
        for (int i = 1; i <= borderWidth; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Setter
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void printWidthLength() {
        System.out.println("Widht: " + width);
        System.out.println("Lenght: " + length);
        System.out.println();
    }
    public void readAttributes() {
        System.out.println("Input for " + Colors.RED + name);
        System.out.print(Colors.YELLOW + "Width: ");
        // Width setzen

        width = input.nextInt();
        System.out.print("Length: ");
        // Length setzen
        length = input.nextInt();

        System.out.print("Borderwidth: " + Colors.RESET);
        // Borderwidth setzen
        borderWidth = input.nextInt();
    }
}
