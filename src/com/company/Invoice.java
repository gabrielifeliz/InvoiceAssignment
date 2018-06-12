package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        ArrayList<LineItem> lineItems = new ArrayList<>();

        String itemCode, exit = "y";
        double subtotal = 0.0;
        int quantity;

        while (exit.equalsIgnoreCase("y")) {

            System.out.print("Enter item code: ");
            itemCode = keyboard.nextLine();
            System.out.print("Enter item quantity: ");
            quantity = keyboard.nextInt();

            try {
                LineItem lineItem = new LineItem(itemCode, quantity);
                lineItems.add(lineItem);
                subtotal += Double.parseDouble(lineItem.getTotal());
            } catch (Exception e) {
                System.out.println("No book found");
            }
            System.out.print("Would you like to continue adding items (\"y\" or \"n\")? ");
            keyboard.nextLine();
            exit = keyboard.nextLine();
            System.out.println();

        }

        System.out.println("\n       Item            Quantity               Description                  Price             Total      \n" +
                           " ----------------  ----------------  ------------------------------  ----------------  -----------------\n");
        for (LineItem s : lineItems) {
            System.out.println(s);
        }
        TaxReport taxReport = new TaxReport(subtotal);
        System.out.println(taxReport);
    }
}
