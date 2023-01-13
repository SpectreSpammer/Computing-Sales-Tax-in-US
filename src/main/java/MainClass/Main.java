package MainClass;

import SalesTaxPerState.CA;
import SalesTaxPerState.MN;
import SalesTaxPerState.NY;
import SalesTaxPerState.TX;
import SalesTaxService.SalesTaxService;

public class Main {

    public static void main(String[] args) {

        //creating an objects
         SalesTaxService CATax = new SalesTaxService(new CA());
         SalesTaxService MNTax = new SalesTaxService(new MN());
        SalesTaxService NMTax = new SalesTaxService(new MN());
        SalesTaxService NYTax = new SalesTaxService(new NY());
        SalesTaxService TXTax = new SalesTaxService(new TX());

         double salesAmount = 1532000.00;

        System.out.println("Sales Tax in CA " + salesAmount + " : " + CATax.calculateTax(salesAmount)) ;
        System.out.println("Sales Tax in MN " + salesAmount + " : " + MNTax.calculateTax(salesAmount)) ;
        System.out.println("Sales Tax in CA " + salesAmount + " : " + NMTax.calculateTax(salesAmount)) ;
        System.out.println("Sales Tax in MN " + salesAmount + " : " + NYTax.calculateTax(salesAmount)) ;
        System.out.println("Sales Tax in CA " + salesAmount + " : " + TXTax.calculateTax(salesAmount)) ;

    }
}
