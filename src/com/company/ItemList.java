package com.company;

import java.text.NumberFormat;

public class ItemList {

    protected String itemCode;
    protected int quantity;
    protected String description;
    protected String price;
    protected String total;

    public ItemList(String itemCode, int quantity,
                    String description, double price) {
        setItemCode(itemCode);
        setQuantity(quantity);
        setDescription(description);
        setPrice(price);
        setTotal();

    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = String.format("%.02f", price);
    }

    public String getTotal() {
        return total;
    }

    public void setTotal() {
        double total = Double.parseDouble(price) * quantity;
        this.total = String.format("%.02f", total);
    }

    @Override
    public String toString() {
        return  "       " + itemCode + "               " + quantity + "                   " + description + "                    " + price + "            " + total + "    \n";

    }
}
