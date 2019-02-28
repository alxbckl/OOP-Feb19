// Scanner einbinden
import java.util.Scanner;

public class Triangle {
    // Attribute
    private int height;
    private String name;
    private Scanner sc = new Scanner(System.in);

    // Methoden
    public Triangle(String name) {
        this.name = name;
    }
    public void readAttributes() {
        System.out.println("Input for " + Colors.RED + name);
        System.out.print(Colors.YELLOW + "Height: " + Colors.RESET);
        // Height setzen
        height = sc.nextInt();
    }
    public void printTriangleCentered() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    public void printTriangleRight() {
        for(int i = 1; i <= height; i++) {
            // 1. Leerzeichen einfügen
            for(int j = height - i; j >= 1; j -- ) {
                System.out.print("  ");
            }
            // 2. Rauten einfügen
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }



            System.out.println();
        }
    }
    public void printTriangleLeft() {
        // Zeilen
        for(int i = 1; i <= height; i++) {
            // Zeichen innerhalb einer Zeile
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}

