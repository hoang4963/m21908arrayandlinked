package controller;

import model.Product;

import java.util.ArrayList;

public class ProductManager {
    public static ArrayList<Product> productArrayList;
    public ProductManager(){
        productArrayList = new ArrayList<>();
    }
    public void addNewProduct(Product p){
        productArrayList.add(p);
    }
    public boolean removeProduct(Product p){
        return productArrayList.remove(p);
    }
    public void removeProductByIndex(int index){
        productArrayList.remove(index);
    }
    public void setProductArrayList(int index, Product p){
        productArrayList.set(index,p);
    }
    public Product getProduct(int index){
       return productArrayList.get(index);
    }
    public int getSize(){
        return productArrayList.size();
    }
}
