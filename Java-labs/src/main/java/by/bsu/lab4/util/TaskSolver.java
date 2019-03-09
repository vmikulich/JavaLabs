package by.bsu.lab4.util;

import by.bsu.lab4.entity.Product;

import java.util.Arrays;


public class TaskSolver {

    public static Product[] getProductsWithGivenName(Product[] products, String productName){
        return Arrays.stream(products).filter(product -> product.getName() == productName).toArray(Product[]::new);
    }

    public static Product[] getProductsUnderGivenPrice(Product[] products, double presetPrice, String productName) {
        Product[] newArrayOfProducts = getProductsWithGivenName(products, productName);
        return Arrays.stream(newArrayOfProducts).filter(product -> product.getPrice() <= presetPrice).toArray(Product[]::new);
    }

    public static Product[] getProductsAboveGivenShelfLife(Product[] products, int productShelfLife) {
        return Arrays.stream(products).filter(product -> product.getShelfLife() > productShelfLife).toArray(Product[]::new);
    }

}
