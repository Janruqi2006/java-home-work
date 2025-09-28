
package daysconversion;

import java.util.Scanner;

public class DaysConversion {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of days: ");
        int totalDays = input.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        System.out.println(totalDays + " days is approximately " + years + " years, " + months + " months, and " + remainingDays + " days.");
        
        input.close();
    }
    
}
