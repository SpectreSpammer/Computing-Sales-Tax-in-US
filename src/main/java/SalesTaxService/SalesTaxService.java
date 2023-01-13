package SalesTaxService;

import Interface.TaxInterface;

public class SalesTaxService {

    //wiring a bean to its dependencies
    private TaxInterface taxInterface;


    //argument constructor
    public SalesTaxService(TaxInterface taxInterface) {
        this.taxInterface = taxInterface;
    }

    //creating a method with a parameter of double amount then passed it to the interface
    public double calculateTax(double amount){
        return taxInterface.calculateTax(amount);
    }


}
