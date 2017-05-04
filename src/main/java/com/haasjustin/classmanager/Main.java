package com.haasjustin.classmanager;


/**
 * Created by justinhaas on 5/1/17.
 */


public class Main {

    public static void main(String[] arg) {
        Inventory inventory = new Inventory();

        Product apples = new Product("Apple", .75, 500);
        Product oranges = new Product("Orange", 1.00, 230);
        Product bananas = new Product("Banana", .50, 110);

        Product[] products = {apples, oranges, bananas};
        inventory.setProducts(products);


        System.out.println(inventory.getProductByName(""));
        System.out.println(inventory.getProducts());
        System.out.println(inventory.getSum());


    }
}
