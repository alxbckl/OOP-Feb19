package Inventories.Products.PhysicalProducts.Phones;

import Inventories.Products.PhysicalProducts.Phone;

public class SmartPhone extends Phone{
    public int id;
    static int anzahl = 0;
    public void test() {
        System.out.println("smartphone");
    }

    public SmartPhone() {
        this.id = anzahl;
        anzahl++;
    }
}
