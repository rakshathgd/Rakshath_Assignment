package corejava.assignments.collection;

import java.util.HashSet;
//Hashset won't naturally allow any duplicate values in the set
public class Q2Hashset {
    public static void main(String[] args) {
    	Product x1=new Product("Bike");
    	Product x2=new Product("Car");
    	Product x3=new Product("Toothpaste");
    	Product x4=new Product("Table");
    	Product x5=new Product("Bottle");
    	Product x6=new Product("Mouse");
    	Product x7=new Product("Cap");
    	Product x8=new Product("Mask");
    	Product x9=new Product("Laptop");
    	Product x10=new Product("Oil");
        HashSet<Product> no_duplicate=new HashSet<Product>();
        no_duplicate.add(x1);
        no_duplicate.add(x2);
        no_duplicate.add(x3);
        no_duplicate.add(x4);
        no_duplicate.add(x5);
        no_duplicate.add(x6);
        no_duplicate.add(x7);
        no_duplicate.add(x8);
        no_duplicate.add(x9);
        no_duplicate.add(x10);
        //the duplicate object addition
        no_duplicate.add(x2);
        
        System.out.println(no_duplicate);

    }
}
  class Product{
    private String p_name;
    public Product(String p_name){
        this.p_name=p_name;
    }
    @Override
    public String toString(){
        return "Product name: "+p_name;
    }
}