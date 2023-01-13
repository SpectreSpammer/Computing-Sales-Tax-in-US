package SalesTaxPerState;

import Interface.TaxInterface;

public class MN implements TaxInterface {


    final double salesTax = 0.0678;

    @Override
    public double calculateTax(double amount) {

      return amount * salesTax;






    }
}
