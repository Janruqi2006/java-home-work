
package displytimec2;
import java.util.Scanner;
public class Displytimec2 {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Enter your second");
        int second=input.nextInt();
        int minutes=second/60;
        int remainsecond =second%60;
        System.out.println(second+"secondnis"+minutes+"minute and"+remainsecond+"second");
  }
    
}
