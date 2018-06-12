package com.company;

import java.util.HashMap;

public class ItemDatabase {

    protected HashMap<String, String> itemCodeAndDescription = new HashMap<>();
    protected HashMap<String, Double> itemDescriptionAndPrice = new HashMap<>();

    public ItemDatabase() {
        setItemCodeAndDescription();
        setItemDescriptionAndPrice();
    }

    public HashMap<String, Double> getItemDescriptionAndPrice() {
        return itemDescriptionAndPrice;
    }

    public void setItemDescriptionAndPrice() {
        itemDescriptionAndPrice.put("Java Book", 45.00);
        itemDescriptionAndPrice.put("Cobol Book", 50.00);
        itemDescriptionAndPrice.put("Python Book", 60.00);
        itemDescriptionAndPrice.put("C++ Book", 55.00);
        itemDescriptionAndPrice.put("JavaScript Book", 30.00);
        itemDescriptionAndPrice.put("HTML Book", 45.00);
        itemDescriptionAndPrice.put("MySQL Book", 60.00);

    }


    public HashMap<String, String> getItemCodeAndDescription() {
        return itemCodeAndDescription;
    }

    public void setItemCodeAndDescription() {

        itemCodeAndDescription.put("J001", "Java Book");
        itemCodeAndDescription.put("C001", "Cobol Book");
        itemCodeAndDescription.put("P001", "Python Book");
        itemCodeAndDescription.put("C002", "C++ Book");
        itemCodeAndDescription.put("J002", "JavaScript Book");
        itemCodeAndDescription.put("H001", "HTML Book");
        itemCodeAndDescription.put("S001", "MySQL Book");

    }
}
