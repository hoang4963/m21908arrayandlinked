package views;

import controller.ProductManager;
import model.Product;

public class Main {
    public static void main(String[] args) {
        ProductManager arrayProduct = new ProductManager();
        Product product1 = new Product("1","4",1000);
        Product product2 = new Product("2","3",3000);
        Product product3 = new Product("3","2",5000);
        Product product4 = new Product("4","1",7000);
        arrayProduct.addNewProduct(product1);
        arrayProduct.addNewProduct(product2);
        arrayProduct.addNewProduct(product3);
        arrayProduct.addNewProduct(product4);
        for (int i = 0; i < arrayProduct.getSize(); i++) {
            System.out.println(arrayProduct.getProduct(i));
        }
    }
}
