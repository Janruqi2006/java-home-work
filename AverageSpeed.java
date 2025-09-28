
package averagespeed;

public class AverageSpeed {

    public static void main(String[] args) {
           double kilometers = 14;
        double miles = kilometers / 1.6;

        double minutes = 45 + 30.0 / 60;
        double hours = minutes / 60;

        double speed = miles / hours;

        System.out.println("Average speed in miles per hour: " + speed);
    }
    
}
