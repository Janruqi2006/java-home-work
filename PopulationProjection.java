
package populationprojection;
public class PopulationProjection {
    public static void main(String[] args) {
                int currentPopulation = 312032486;
        int secondsPerYear = 365 * 24 * 60 * 60;

        int birthsPerYear = secondsPerYear / 7;
        int deathsPerYear = secondsPerYear / 13;
        int immigrantsPerYear = secondsPerYear / 45;

        int annualChange = birthsPerYear - deathsPerYear + immigrantsPerYear;

        for (int year = 1; year <= 5; year++) {
            currentPopulation += annualChange;
            System.out.println("Year " + year + " population: " + currentPopulation);
        }
    }
}
    

