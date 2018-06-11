package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        ArrayList<ItemList> itemLists = new ArrayList<>();

        String itemCode, description;
        double price, subtotal = 0.0;
        int quantity, loopCount = 0;

        while (loopCount != 1) {

            System.out.print((loopCount == 0) ? "Enter item code: "
                    : "\nEnter item code: ");
            itemCode = keyboard.nextLine();
            System.out.print("Enter item quantity: ");
            quantity = keyboard.nextInt();
            System.out.print("Enter item description: ");
            keyboard.nextLine();
            description = keyboard.nextLine();
            System.out.print("Enter item price: ");
            price = keyboard.nextDouble();
            keyboard.nextLine();

            ItemList itemList = new ItemList(itemCode, quantity, description, price);
            itemLists.add(itemList);
            subtotal += Double.parseDouble(itemList.getTotal());
            loopCount++;
        }

        System.out.println("\n       Item            Quantity               Description                  Price             Total      \n" +
                           " ----------------  ----------------  ------------------------------  ----------------  -----------------\n");
        for (ItemList s : itemLists) {
            System.out.println(s);
        }
        TaxReport taxReport = new TaxReport(subtotal);
        System.out.println(taxReport);
    }
}
