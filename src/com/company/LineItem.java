package com.company;

public class LineItem extends ItemDatabase {

    // Create protected data field so that subclasses access their value
    protected String itemCode;
    protected int quantity;
    protected String description;
    protected String price;
    protected String total;

    /* Create a constructor that call all the setters in the class.
     * Call the superclass's constructor using super.
     * Two of these setters receive an argument from this constructor
     * (setQuantity and setDescription)*/
    public LineItem(String itemPurchased, int quantity) {
        super();
        setQuantity(quantity);
        setDescription(itemPurchased);
        setItemCode();
        setPrice();
        setTotal();
    }

    /* This method is responsible for assigning a value to the item code with the HashMap
    * itemDescriptionAndCode based on the description from user input*/
    public void setItemCode() {
        itemCode = itemDescriptionAndCode.get(description);
    }

    /* This method is responsible for assigning a value to quantity from user input */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /* This method is responsible for assigning the item code with the HashMap
     * itemDescriptionAndCode based on the description from user input*/
    public void setDescription(String itemPurchased) {
        for (String item : itemDescriptionAndCode.keySet()) {
            if (item.toUpperCase().contains(itemPurchased.toUpperCase())) {
                description = item;
            }
        }
    }

    /* This method is responsible for returning value of description */
    public String getDescription() {
        return description;
    }

    /* This method is responsible for assigning a value to the price with the HashMap
    * itemDescriptionAndPrice based on the description from user input*/
    public void setPrice() {
        double price = itemDescriptionAndPrice.get(description);
        // Change format of double value to two decimal places as a string
        this.price = String.format("%.02f", price);
    }

    /* This method is responsible for returning value of total */
    public String getTotal() {
        return total;
    }

    public void setTotal() {
        // Convert string price to double to calculate total
        double total = Double.parseDouble(price) * quantity;
        // Change format of double value to two decimal places as a string
        this.total = String.format("%.02f", total);
    }

    /* This method is responsible for returning a line item
    * of the item number, description, quantity and price. */
    @Override
    public String toString() {
        return "       " + itemCode + "               " + quantity + "                   "
                    + description + "                    " + price + "            " + total + "    \n";

    }
}
