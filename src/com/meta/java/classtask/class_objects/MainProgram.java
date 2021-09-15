package com.meta.java.classtask.class_objects;
/*

 */

public class MainProgram {
    public static void main(String[] args) {
        Product product = new Product();

        product.name="Noodles";
        product.brand="CG";
        product.uniqueCode="CG-FOO12";
        product.price=20.00;
        product.displayProduct();
        System.out.println("--------------");


        if ( product.checkIfProductPriceisHigherrThan(100.00)){
            System.out.println("The Price is higher than the ");
        }
    }
}
