
package sum.natural.number;

import java.util.Scanner;

public class SumNaturalNumber {

    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=input.nextInt();
        int sum= n*(n+1)/2;
        System.out.println("sum of +first"+n+"natural number="+sum);
        input.close();
    }
    
}
