
package salestax;
import java.util.Scanner;
public class SalesTax {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter your purchose amount");
        double amount=input.nextDouble();
        final double TAx_RATE=0.06;
        double tax= TAx_RATE*amount;
        double total=tax+amount;
        System.out.println("the salary is"+tax);
        System.out.println("the total amount is"+total);
    }
    
}
