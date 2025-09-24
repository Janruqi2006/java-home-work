
package swap.two.number;

public class SwapTwoNumber {

    public static void main(String[] args) {
    int a=45;
    int b=65;
        System.out.println("befor swap a:"+a+"b:"+b);
        a=a+b;
        b=a+b;
        a=a-b;
        System.out.println("after swap a:"+a+"b:"+b);
    }
    
}
