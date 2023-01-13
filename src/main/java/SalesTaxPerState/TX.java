package SalesTaxPerState;

import Interface.TaxInterface;

public class TX  implements TaxInterface {

    final double salesTax = 0.0625;


    @Override
    public double calculateTax(double amount) {
        return amount * salesTax;
    }
}
