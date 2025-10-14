import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);


Product k = new Product();
System.out.println(k);
    
//candy input 

Candy b = new Candy("M&M",2.25,false,true);
System.out.println(b);
Candy d = new Candy("Snickers",1.15,true,true);
System.out.println(d);
Candy f = new Candy("Skittles",1.75,false,false);
   System.out.println(f);
    
   // soda input 
    
Soda h = new Soda("Coca Cola",2.25,false,true);
System.out.println(h);
Soda i = new Soda("Iced tea",3.25,false,false);
System.out.println(i);
Soda j = new Soda("Milk",3.35,true,false);
   System.out.println(j); 
    
// product input 

Product l = new Product("Scratcher",1.99,false);
System.out.println(l);
Product m = new Product("Powerbowl",2.00,false);
System.out.println(m);
Product n = new Product("Pizza",1.85,true);
   System.out.println(n); 
    

    // Closes the Scanner object
    input.close();
    
  }
}