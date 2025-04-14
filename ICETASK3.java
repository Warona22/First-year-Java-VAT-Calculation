package com.mycompany.icetask3;
import java.util.Scanner;

public class ICETASK3 {

public static Scanner input= new Scanner(System.in);
    public static void main(String[] args) {
        // declare the variables 
        String prodName=" ";
        double price=0;
        
        //prompt the user for the product name 
        System.out.print("Please enter the product name>>\t");
        prodName=input.nextLine();
        
        System.out.print("Enter the price for LCD TV>>\t" + getProductName(prodName));
       price=input.nextDouble();
        
        
        //Call getProductName Method
        System.out.print("PRODUCT NAME>>\t" + getProductName(prodName));
        System.out.print("\nTotalDUE>>\t" + getFinalPrice(price));
        
        //Call getFinalprice Method
        getFinalPrice(price);
       
    }//end of main 
    public static String getProductName(String prodname)
    {
        String prodName = "";
       String productName=prodName;
       return productName;
    }//end of product name 
    
    public static double getFinalPrice (double price)
    {
        double finalPrice=0;
        final double VAT=0.14;
        final double DISCOUNT=0.05;
        double vatDue=0;
        double discountDue=0;
        /*finalPrice=price+vatDue;
        vatDue=price*VAT;
        finalPrice=finalPrice-DISCOUNT;
        discountDue=finalPrice*DISCOUNT;
        finalPrice=price+vatDue;
        */
        finalPrice = price + (price*VAT);
        discountDue = finalPrice * DISCOUNT;
        if  (finalPrice>1000)
        {
            finalPrice=finalPrice-discountDue;
        }
        return finalPrice;
    }//end of product price 
}//end  of class

