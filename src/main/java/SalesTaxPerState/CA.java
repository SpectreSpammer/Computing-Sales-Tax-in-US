package SalesTaxPerState;

import Interface.TaxInterface;

public class CA implements TaxInterface {

    final double salesTax = 0.065;

    @Override
    public double calculateTax(double amount) {


        return amount * salesTax;
    }
}
