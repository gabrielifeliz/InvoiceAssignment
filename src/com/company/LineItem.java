package com.company;

public class LineItem extends ItemDatabase {

    protected String itemCode;
    protected int quantity;
    protected String description;
    protected String price;
    protected String total;

    public LineItem(String itemCode, int quantity) {
        super();
        setItemCode(itemCode);
        setQuantity(quantity);
        setDescription();
        setPrice();
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

    public void setDescription() {
        description = itemCodeAndDescription.get(itemCode);
    }

    public String getPrice() {
        return price;
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
