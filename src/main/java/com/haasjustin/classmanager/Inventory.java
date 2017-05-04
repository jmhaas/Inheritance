package com.haasjustin.classmanager;


/**
 * Created by justinhaas on 5/2/17.
 */
public class Inventory {

    Product[] products;

    public Product[] getProducts() {
        return products;
    }

    public Product getProductByName(String name) {

        Product outcome = new Product();

        for (Product product : products) {
            if (product.getName() == name) {
                outcome = product;
            }
        }

        return outcome;


    }

    public void setProducts(Product[] product) {
        this.products = product;
    }

    public int getSum() {
        int sum = 0;

        for (Product product : products) {
            sum += product.getQuantity() * product.getPrice();
        }

        return sum;
    }
}