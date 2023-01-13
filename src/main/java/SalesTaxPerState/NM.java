package SalesTaxPerState;

import Interface.TaxInterface;

public class NM implements TaxInterface {


    final double salesTax = 0.05125;

    @Override
    public double calculateTax(double amount) {
        return amount * salesTax;
    }
}
