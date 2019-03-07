import Inventories.Product;
import Inventories.Products.DigitalProducts.OperatingSystems.Linux;
import Inventories.Products.PhysicalProducts.Phones.SmartPhone;


import java.util.Objects;
import java.util.List;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


import java.util.ArrayList;

public class InventoryManagement {
    // Attribute
    SmartPhone smartPhone;
    Linux linux;

    ArrayList<Product> productList = new ArrayList<Product>();

    ArrayList test = new ArrayList<>();


    // Methoden
    public void start() {
        test.add(new Linux());


        test.add(new SmartPhone());

        ((SmartPhone)test.get(1)).test();


        // Neues Produkt hinzufügen
        addProduct(new SmartPhone());
        addProduct(new Linux());
        addProduct(new SmartPhone());
        addProduct(new Linux());
        addProduct(new SmartPhone());
        addProduct(new Linux());
        addProduct(new SmartPhone());
        addProduct(new Linux());

        getProduct(0);
        System.out.println(this.smartPhone.id);
        getProduct(2);
        System.out.println(this.smartPhone.id);
        getProduct(4);
        System.out.println(this.smartPhone.id);
        getProduct(6);
        System.out.println(this.smartPhone.id);

        System.out.println(((SmartPhone) getProduct(0)).getClass());
        System.out.println(getProduct(0).getClass());

        //ObjectConverter.convert(getProduct(0), (getProduct(0)).getClass()).test();
        System.out.println(getProduct(0).getClass());


    }

    public void addProduct (Product product) {
        productList.add(product);
    }

    public Product getProduct(int i) {
        if (productList.get(i) instanceof SmartPhone) {
            this.smartPhone = (SmartPhone) productList.get(i);
            return (SmartPhone) productList.get(i);
        }
        else if (productList.get(i) instanceof Linux) {
            this.linux = (Linux) productList.get(i);
            return (Linux) productList.get(i);
        }
        return null;
    }

    public static void main(String[] args) {
        new InventoryManagement().start();
    }


}

