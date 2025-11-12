
package futuretuition;

public class Futuretuition {

    public static void main(String[] args) {
     
        double tuition = 10000;   // starting tuition
        int year = 0;

        while (tuition < 20000) { // while not doubled
            tuition = tuition * 1.07;  // increase 7% each year
            year++;
        }

        System.out.println("Tuition will be doubled in " + year + " years.");
        System.out.printf("Tuition will be $%.2f in %d years.\n", tuition, year);
    }
}
    
    

