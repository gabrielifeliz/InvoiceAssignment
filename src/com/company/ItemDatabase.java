package com.company;

/* The design of this small "database" class is relational.
 * The key has different values. The books have their own code and price.
 * However, HashMaps only allow one value per key.
 * This is the reason the relationship of books and their code and price
 * are placed in two separate HashMaps */

import java.util.HashMap;

public class ItemDatabase {

    // Create protected data field so that subclasses access their value
    protected HashMap<String, String> itemDescriptionAndCode = new HashMap<>();
    protected HashMap<String, Double> itemDescriptionAndPrice = new HashMap<>();

    /* Create a no-arg constructor that sets the two HashMaps
    * itemDescriptionAndCode and itemDescriptionAndPrice */
    public ItemDatabase() {
        setItemCodeAndDescription();
        setItemDescriptionAndPrice();
    }

    /* This method is responsible for setting the books available
    * in the database and their prices */
    public void setItemDescriptionAndPrice() {
        itemDescriptionAndPrice.put("Java Book", 75.00);
        itemDescriptionAndPrice.put("Cobol Book", 50.00);
        itemDescriptionAndPrice.put("Python Book", 60.00);
        itemDescriptionAndPrice.put("C++ Book", 55.00);
        itemDescriptionAndPrice.put("HTML Book", 45.00);
        itemDescriptionAndPrice.put("MySQL Book", 60.00);
    }

    /* This method is responsible for setting the books available
     * in the database and their codes */
    public void setItemCodeAndDescription() {

        itemDescriptionAndCode.put("Java Book", "J001");
        itemDescriptionAndCode.put("Cobol Book", "C001");
        itemDescriptionAndCode.put("Python Book", "P001");
        itemDescriptionAndCode.put("C++ Book", "C002");
        itemDescriptionAndCode.put("HTML Book", "H001");
        itemDescriptionAndCode.put("MySQL Book", "S001");
    }
}
