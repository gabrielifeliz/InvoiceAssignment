package com.company;

import java.util.HashMap;

public class ItemDatabase {

    protected HashMap<String, String> itemDescriptionAndCode = new HashMap<>();
    protected HashMap<String, Double> itemDescriptionAndPrice = new HashMap<>();

    public ItemDatabase() {
        setItemCodeAndDescription();
        setItemDescriptionAndPrice();
    }

    public HashMap<String, Double> getItemDescriptionAndPrice() {
        return itemDescriptionAndPrice;
    }

    public void setItemDescriptionAndPrice() {
        itemDescriptionAndPrice.put("Java Book", 75.00);
        itemDescriptionAndPrice.put("Cobol Book", 50.00);
        itemDescriptionAndPrice.put("Python Book", 60.00);
        itemDescriptionAndPrice.put("C++ Book", 55.00);
        itemDescriptionAndPrice.put("HTML Book", 45.00);
        itemDescriptionAndPrice.put("MySQL Book", 60.00);

    }


    public HashMap<String, String> getItemCodeAndDescription() {
        return itemDescriptionAndCode;
    }

    public void setItemCodeAndDescription() {

        itemDescriptionAndCode.put("Java Book", "J001");
        itemDescriptionAndCode.put("Cobol Book", "C001");
        itemDescriptionAndCode.put("Python Book", "P001");
        itemDescriptionAndCode.put("C++ Book", "C002");
        itemDescriptionAndCode.put("HTML Book", "H001");
        itemDescriptionAndCode.put("MySQL Book", "S001");

    }
}
