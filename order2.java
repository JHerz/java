package order2;

import java.util.ArrayList;
import java.util.Scanner;

public class Order2 {

public static void main(String[] args) {
        int total = 0;
        double tax = .07;
        double addTax = 0;
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Item> items = new ArrayList();
        
        String buyMore = "y";
        System.out.println("Welcome to Musical Meat!");
        while (buyMore.equalsIgnoreCase("y")) {

            System.out.println("What would you like to purchase? (we sell pianos, socks, and hamburgers)");
            String itemChoice = sc.next();
            System.out.println("How many would you like?");
            int quantity = sc.nextInt();

            if (itemChoice.equalsIgnoreCase("piano") || itemChoice.equalsIgnoreCase("pianos")) {
                //for (int i = quantity; i > 0; i--) {
                Item piano = new Item("piano", 2500, true);

                //total += 2500;
                piano.setQuantity(quantity);
                items.add(piano);
                //}
            } else if (itemChoice.equalsIgnoreCase("socks")) {
                //for (int i = quantity; i > 0; i--) {
                Item socks = new Item("sock", 3, true);

                //total += 3;
                socks.setQuantity(quantity);
                items.add(socks);
                //}
            } else if (itemChoice.equalsIgnoreCase("hamburger") || itemChoice.equalsIgnoreCase("hamburgers")) {
                //for (int i = quantity; i > 0; i--) {
                Item hamburger = new Item("hamburger", 7, false);

                //total += 7;
                hamburger.setQuantity(quantity);
                items.add(hamburger);
                // }
            }
            System.out.println("would you like to place another item in your cart? (y/n)");
            buyMore = sc.next();

        }

        System.out.println("You have ordered:  ");
        for (Item i : items) {
            System.out.println(i.getQuantity() + " " + i.getName() + "s");
            
            total += i.getPrice() * i.getQuantity();
            if(i.isTaxable() == true){
                addTax += (total*tax);
            }
        }
        System.out.println("Your pre-tax total is $" + total+ "\nYour final total is " + (total + addTax));
        
    }
}   
