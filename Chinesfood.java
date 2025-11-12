
package chinesfood;

import java.util.Scanner;

public class Chinesfood {

    public static void main(String[] args) {
             Scanner input=new Scanner(System.in);
        System.out.println("enter you day");
        int day=input.nextInt();
        switch(day%12){
            case 0:System.out.println("Monkey");
            break;
              case 1:System.out.println("rooster");
            break;
                      case 2:System.out.println("dog");
            break;
                      case 3:System.out.println("pig");
            break;
                      case 4:System.out.println("rat");
            break;
                      case 5:System.out.println("ox");
            break;
                      case 6:System.out.println("tiger");
            break;
                                  case 7:System.out.println("rabbit");
            break;
                                          case 8:System.out.println("dragon");
            break;
                                          case 9:System.out.println("snak ");
            break;
                                          case 10:System.out.println("hourse");
            break;
                                          case 11:System.out.println("sheep");
          
            
    }
    
}
}

