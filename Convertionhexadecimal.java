
package convertionhexadecimal;

import java.util.Scanner;

public class Convertionhexadecimal {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hexadecimal digit (0–9 or A–F): ");
        String hex = input.nextLine().toUpperCase();

        if (hex.length() != 1 || 
            (hex.charAt(0) < '0' || (hex.charAt(0) > '9' && hex.charAt(0) < 'A') || hex.charAt(0) > 'F')) {
            System.out.println("Invalid hexadecimal digit.");
        } else {
            char hexChar = hex.charAt(0);
            int decimal;

            if (Character.isDigit(hexChar)) {
                decimal = hexChar - '0';
            } else {
                decimal = 10 + (hexChar - 'A');
            }

            System.out.println("The decimal value of " + hexChar + " is " + decimal);
        }
    }
}




