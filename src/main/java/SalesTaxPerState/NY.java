package SalesTaxPerState;

import Interface.TaxInterface;

public class NY implements TaxInterface {

    final double salesTax = 0.04;

    @Override
    public double calculateTax(double amount) {
        return amount * salesTax;
    }
}
