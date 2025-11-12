
package computechange;

import java.util.Scanner;

public class ComputeChange {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("Enter your amount");
        double amount=input.nextDouble();
        int remainingamount = (int)(amount * 100);
        int numberOfOneDollars = remainingamount / 100;
        remainingamount = remainingamount % 100;
        int numberOfQuarters = remainingamount / 25;
        remainingamount = remainingamount % 25;
        int numberOfDimes = remainingamount / 10;
remainingamount = remainingamount % 10;
int numberOfNickels = remainingamount / 5;
 remainingamount = remainingamount % 5;
int numberOfPennies = remainingamount;

System.out.println("Your amount " + amount + " consists of");
 System.out.println(" " + numberOfOneDollars + " dollars");
System.out.println(" " + numberOfQuarters + " quarters ");
 System.out.println(" " + numberOfDimes + " dimes");
 System.out.println(" " + numberOfNickels + " nickels");
 System.out.println(" " + numberOfPennies + " pennies");
    }
    
}
