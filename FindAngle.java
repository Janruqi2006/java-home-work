
package findangle;

import java.util.Scanner;

public class FindAngle {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Enter x1,x2,x3,y1,y2,y3");
       double x1=input.nextInt();
        double y1=input.nextInt();
        double x2=input.nextInt();
        double y2=input.nextInt();
        double x3=input.nextInt();
        double y3=input.nextInt();
        double a=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        double b=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        double c=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        double A=Math.acos(a*a-b*b-c*c/-2*b*c);
         double B=Math.acos(b*b-a*a-c*c/-2*a*c);
          double C=Math.acos(c*c-b*b-a*a/-2*b*a);
          System.out.println("the tree angel are"+Math.round(A * 100) / 100.0 + " "+Math.round(B * 100) / 100.0 + " " +Math.round(C * 100) / 100.0 );
          
        
    }
    
}
