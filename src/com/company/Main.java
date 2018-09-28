package com.company;
//create/display an array list of grocery items entered
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Display> displays = new ArrayList<>();

        String addDisplay = "";
        Display theDisplay = new Display();
        do {
            System.out.println("What do you want to buy?");
            Scanner keyboard = new Scanner(System.in);

            String userInputGrocery = keyboard.nextLine();
            theDisplay.setGrocery(userInputGrocery);

            System.out.println("How much is this item?");
            int userInputPrice = keyboard.nextInt();
            theDisplay.setPrice(userInputPrice);

            System.out.println("How many would you like?");
            int userInputQuantity = keyboard.nextInt();
            theDisplay.setQuantity(userInputQuantity);

            int cost = userInputPrice * userInputQuantity;
            System.out.println("Total costs is " + cost + "\n");
            theDisplay.setCost(cost);

            System.out.printf("Your grocery is %s, your price is %d, your quantity is %d\n", theDisplay.getGrocery(), theDisplay.getPrice(), theDisplay.getQuantity(), theDisplay.getCost());

            System.out.println("Do you want to enter another item??\n"); //this loop is not working???
            keyboard = new Scanner(System.in);
            addDisplay = keyboard.next();

            displays.add(theDisplay);
       }while (addDisplay.equalsIgnoreCase("yes"));


        for (Display item : displays) {
            System.out.println("Item name " +"\t" + "Price" +"\t" + "Quantity " +"\t" + "Cost ");
            System.out.println(item.getGrocery() +"\t" +"\t"+ "\t" + item.getPrice() +"\t" +"\t" + item.getQuantity()+"\t" + "\t" +item.getCost());
            System.out.println("Total Purchase amount = ");
            System.out.println("Total items purchased = " );
        }
//method to calculate total cost.
    }





  //  }
    {

    }

    }
