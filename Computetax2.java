
package computetax2;

import java.util.Scanner;

public class Computetax2 {

    public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
                   System.out.print("Enter your filing status (0 = Single, 1 = Married): ");
        int status = input.nextInt();

        System.out.print("Enter your income: ");
        double income = input.nextDouble();
          double tax = 0;

        if (status == 0) { // Single
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
        } else if (status == 1) { // Married
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            else
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
        } else {
            System.out.println("Invalid status.");
            return;
        }

        System.out.printf("Tax is: $%.2f%n", tax);
    }
}



        
        

       
    
    

