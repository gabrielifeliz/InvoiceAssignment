package com.company;

/* This class takes care of the tax section of the invoice report.
* It sets the taxable and untaxable from user input.
* It also calculates the tax and grand total */

public class TaxReport {

    // Create protected data field so that subclasses access their value
    protected String taxableSubtotal = "0.00";
    protected String untaxableSubtotal = "0.00";
    protected String tax = "0.00";
    protected String grandTotal = "0.00";

    /* Create a constructor that call all the setters in the class.
     * Two of these setters receive an argument from this constructor
      * (setTaxableSubtotal and setUntaxableSubtotal)*/
    public TaxReport(double taxableSubtotal, double untaxableSubtotal) {
        setTaxableSubtotal(taxableSubtotal);
        setUntaxableSubtotal(untaxableSubtotal);
        setTax();
        setGrandTotal();
    }

    /* This method is responsible for setting the value of the taxable subtotal,
    * which is determined by user input*/
    public void setTaxableSubtotal(double subtotal) {
        // Change format of double value to two decimal places as a string
        this.taxableSubtotal = String.format("%.02f", subtotal);
    }

    /* This method is responsible for setting the value of the untaxable subtotal,
    * which is determined by user input*/
    public void setUntaxableSubtotal(double subtotal) {
        // Change format of double value to two decimal places as a string
        this.untaxableSubtotal = String.format("%.02f", subtotal);
    }

    /* This method is responsible for calculating the taxable subtotal tax (5%)*/
    public void setTax() {
        // Convert string taxableSubtotal to double to calculate tax
        double tax = Double.parseDouble(taxableSubtotal) * 0.05;
        // Change format of double value to two decimal places as a string
        this.tax = String.format("%.02f", tax);
    }

    /* This method is responsible for calculating the grand total of the item purchases */
    public void setGrandTotal() {
        // Convert string taxableSubtotal, untaxableSubtotal, and tax to double to calculate grand total
        double grandTotal = (Double.parseDouble(taxableSubtotal)
                + Double.parseDouble(tax)) + (Double.parseDouble(untaxableSubtotal));
        // Change format of double value to two decimal places as a string
        this.grandTotal = String.format("%.02f", grandTotal);
    }

    /* This method is responsible for returning the invoice report*/
    @Override
    public String toString() {
        return "\nTaxable subtotal: $" + taxableSubtotal +
                "\n\nUntaxable subtotal: $" + untaxableSubtotal
                + "\n\nTax: $" + tax + "\n\nGrand Total: $" + grandTotal;
    }
}
