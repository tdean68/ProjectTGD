//Module 5 Assignment 2
//Timothy Dean

import java.util.ArrayList;

public class Asn5
{
    public static void main(String[] args)
    {
        ArrayList<String> sodas = new ArrayList<>(); // Create an ArrayList to store soda names
        sodas.add("Coke");
        sodas.add("Pepsi");
        sodas.add("Dr. Pepper");
        sodas.add("Cheerwine");

        ArrayList<Double> prices = new ArrayList<>(); // Create an ArrayList to store soda prices
        prices.add(3.49);
        prices.add(3.31);
        prices.add(2.99);
        prices.add(1.58);

     System.out.println("Soda List:");
        for (int i = 0; i < sodas.size(); i++) //Loop through the sodas ArrayList and print each soda name
    {
    System.out.println("Item: " + sodas.get(i));
    }

    System.out.println("\nPrice List:");
        for (int i = 0; i < prices.size(); i++) // Loop through the prices ArrayList and print each price
    {
    System.out.println("Price: " + prices.get(i));
    }
 
        sodas.set(3, "Mountain Dew"); // Update the soda name from "Cheerwine" to "Mountain Dew"
        System.out.println("\nUpdated Soda List:");
        
        for (String soda : sodas) // Loop through the sodas ArrayList using an enhanced for loop and print each soda name
             {
            System.out.println("Item:  " + soda);
        }
    
        prices.set(3, 2.05); // Update the price to refelct the new soda name
        System.out.println("\nUpdated Price List: ");

            for (Double price : prices) // Loop through the prices ArrayList using an enhanced for loop and print each price
                 {
            System.out.println("Price: " + price);
            }
    }
}