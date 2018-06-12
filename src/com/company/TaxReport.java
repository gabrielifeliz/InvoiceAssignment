package com.company;

public class TaxReport {

    protected String taxableSubtotal;
    protected String tax;
    protected String grandTotal;

    public TaxReport(double subtotal) {
        setTaxableSubtotal(subtotal);
        setTax();
        setGrandTotal();
    }

    public void setTaxableSubtotal(double taxableSubtotal) {
        this.taxableSubtotal = String.format("%.02f", taxableSubtotal);
    }

    public void setTax() {
        double tax = Double.parseDouble(taxableSubtotal) * 0.05;
        this.tax = String.format("%.02f", tax);
    }

    public void setGrandTotal() {
        double grandTotal = Double.parseDouble(taxableSubtotal) + Double.parseDouble(tax);
        this.grandTotal = String.format("%.02f", grandTotal);;
    }

    @Override
    public String toString() {
        return "Taxable subtotal: $" + taxableSubtotal + "\nUntaxable subtotal: $ 0"
                + "\nTax: $" + tax + "\nGrand Total: $" + grandTotal;
    }
}
