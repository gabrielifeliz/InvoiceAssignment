package com.company;

import java.util.*;

public class Invoice {

    public static void main(String[] args) {

        // Create Scanner object to receive user input
        Scanner keyboard = new Scanner(System.in);
        // Create ArrayList of LineItems to display a list of items and their properties
        ArrayList<LineItem> lineItems = new ArrayList<>();

        /* Declare String variables that hold user input
            Based on the value, the program will perform certain actions */
        String itemPurchased, addItem, exit = "y";
        /* Declare boolean variable to obtains user
            input about whether an item is taxable or not */
        boolean taxable;
        // Declare and initialize double variables
        double taxableSubtotal = 0.0, untaxableSubtotal = 0.0;
        /* Declare int variable to obtains user input
            about how many of an item will be purchased */
        int quantity;

        // Repeat actions under while loop until exit does not equals "Y" or "y"
        while (exit.equalsIgnoreCase("y")) {

            // Prompt the user for the item purchased and get user input
            System.out.print("Enter item purchased: ");
            itemPurchased = keyboard.nextLine();
            // Prompt the user for the item quantity and get user input
            System.out.print("Enter item quantity: ");
            quantity = keyboard.nextInt();

            try {
                // Create LineItem object to process the characteristics of an item
                LineItem lineItem = new LineItem(itemPurchased, quantity);
                // Let the user know that the book is in the database
                System.out.println("Book found: " + lineItem.getDescription());
                // Prompt the user whether he/she wants to add this item and get user input
                System.out.print("Would you like to add this item (\"y\" or \"n\")? ");
                keyboard.nextLine(); // Clean up any extra newline character
                addItem = keyboard.nextLine();

                // Add item to the ArrayList if the user enters "y" or "Y"
                if (addItem.equalsIgnoreCase("y")) {
                    lineItems.add(lineItem);

                    // Prompt the user whether the item is taxable and get user input
                    System.out.print("Is this item taxable (\"true\" or \"false\")? ");
                    taxable = keyboard.nextBoolean();
                    if (taxable)
                        // If taxable is true, add the total to taxableSubtotal.
                        taxableSubtotal += Double.parseDouble(lineItem.getTotal());
                    else
                        // Otherwise, add the total to untaxableSubtotal
                        untaxableSubtotal += Double.parseDouble(lineItem.getTotal());
                }

            } catch (NullPointerException e) {
                // Catch NullPointerException and display message
                //  to let the user know the book is not found in the database
                System.out.println("No book found");
            }

            // Prompt the user whether he/she wants to continue adding items and get user input
            System.out.print("Would you like to continue adding items (\"y\" or \"n\")? ");
            keyboard.nextLine(); // Clean up any extra newline character
            exit = keyboard.nextLine();
            System.out.println();

        }

        // Display invoice heading
        System.out.println("\n       Item            Quantity               Description                  Price             Total      \n" +
                           " ----------------  ----------------  ------------------------------  ----------------  -----------------\n");
        // Display several line items using an enhanced for loop
        for (LineItem s : lineItems) {
            System.out.println(s);
        }
        // Create TaxReport object to process tax report
        TaxReport taxReport = new TaxReport(taxableSubtotal, untaxableSubtotal);
        // Display taxReport toString method, which contains the tax report
        System.out.println(taxReport);
    }
}
