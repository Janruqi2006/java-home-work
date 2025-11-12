
package guessbirthday;

import java.util.Scanner;


public class Guessbirthday {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int day = 0;

        String[] sets = {
            "Set 1:\n1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31",
            "Set 2:\n2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31",
            "Set 3:\n4 5 6 7 12 13 14 15 20 21 22 23 28 29 30 31",
            "Set 4:\n8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31",
            "Set 5:\n16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31"
        };

        for (int i = 0; i < sets.length; i++) {
            System.out.println(sets[i]);
            System.out.print("Is your birthday in this set? (y/n): ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                day += Math.pow(2, i);
            }
        }

        System.out.println("Your birthday is on the " + day + "th!");
    }
}



    
    

