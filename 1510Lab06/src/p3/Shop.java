package p3;
//*************************************************************** 
//   Shop.java 
// 
//   Uses the Item class to create items and add them to a shopping 
//   cart stored in an ArrayList. 
// *************************************************************** 

import java.util.ArrayList; 
import java.util.Scanner; 
import java.text.NumberFormat;

public class Shop {
    
    
    
    public static void main (String[] args)    { 
        
        String itemName; 
        double itemPrice; 
        int quantity; 
        double totalPrice;
        
        ArrayList<Item> cart = new ArrayList<Item>();
        
        Scanner scan = new Scanner(System.in); 
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        String keepShopping = "y"; 
        
        do { 
            System.out.print("Enter the name of the item: "); 
            itemName = scan.nextLine(); 
             System.out.print("Enter the unit price: "); 
            itemPrice = Double.parseDouble(scan.nextLine()); 
            System.out.print("Enter the quantity: "); 
            quantity = Integer.parseInt(scan.nextLine()); 
            // *** create a new item and add it to the cart
            cart.add(new Item(itemName, itemPrice, quantity));
            // *** print the contents of the cart object using println
            
            System.out.println();
            totalPrice = 0;
                for  (Item myItem : cart)  {
                    System.out.println(myItem); 
                    totalPrice += myItem.getPrice() * myItem.getQuantity();
            
                }
                System.out.println("Total price: " + fmt.format(totalPrice));
                System.out.println();
            System.out.print("Continue shopping (y/n)? "); 
            keepShopping = scan.nextLine(); 
        } 
        while (keepShopping.equals("y"));    
    }
    
}