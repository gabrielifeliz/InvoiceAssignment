package com.company;

public class LineItem extends ItemDatabase {

    protected String itemCode;
    protected int quantity;
    protected String description;
    protected String price;
    protected String total;

    public LineItem(String itemPurchased, int quantity) {
        super();
        setQuantity(quantity);
        setDescription(itemPurchased);
        setItemCode();
        setPrice();
        setTotal();

    }

    public void setItemCode() {
        itemCode = itemDescriptionAndCode.get(description);
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String itemPurchased) {
        for (String item : itemDescriptionAndCode.keySet()) {
            if (item.toLowerCase().contains(itemPurchased)) {
                description = item;
            } else if (item.toUpperCase().contains(itemPurchased)) {
                description = item;
            } else if (item.contains(itemPurchased)) {
                description = item;
            }
        }
    }

    public String getDescription() {
        return description;
    }

    public void setPrice() {
        double price = itemDescriptionAndPrice.get(description);
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
        return "       " + itemCode + "               " + quantity + "                   "
                    + description + "                    " + price + "            " + total + "    \n";

    }
}
