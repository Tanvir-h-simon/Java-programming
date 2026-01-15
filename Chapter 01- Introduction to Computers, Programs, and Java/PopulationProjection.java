public class PopulationProjection {
    public static void main(String[] args){
        double currentPopulation = 312032486;
        //Time conversations
        int secondsPerYear = 365 * 24 * 60 * 60;
        double birthPerYear = (1.0 / 7) * secondsPerYear;
        double deathPerYear =  (1.0 / 13) * secondsPerYear;
        double immigrantPerYear = (1.0 / 45) * secondsPerYear;
        for (int year = 1; year <= 5; year++){
            currentPopulation += birthPerYear - deathPerYear + immigrantPerYear;
            System.out.printf("Population at the end of the year %d: %.0f%n", year, currentPopulation);
        }
    }
}