
package a.simple.math.learning.tool;

import java.util.Random;
import java.util.Scanner;

public class ASimpleMathLearningTool {

    public static void main(String[] args) {
               Scanner input=new Scanner(System.in);
        Random random=new Random();
        int number1=random.nextInt(10);
          int number2=random.nextInt(10);  
          int correctanswer=number1-number2;
          System.out.println("what is"+number1+"-"+number2+"?");
          int useranswer=input.nextInt();
          if(useranswer==correctanswer){
          System.out.println("It is correct");}
          
          else{
              System.out.println("it is whrong.try again"+correctanswer);}
          input.close();

    }
    
}
