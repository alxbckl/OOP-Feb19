import Inventories.Product;
import Inventories.Products.PhysicalProducts.Phones.SmartPhone;

import java.util.ArrayList;

public class InventoryManagement {
    // Attribute
    ArrayList<Product> productList = new ArrayList<Product>();

    // Methoden
    public void start() {
        // Neues Produkt hinzufügen
        Product p = new SmartPhone();

    }

    public void addProduct (Product product) {
        productList.add(product);
    }

    public static void main(String[] args) {
        new InventoryManagement().start();
    }
}
