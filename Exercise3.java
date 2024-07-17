public class Exercise3 {
   
    public static void main(String[] args) {
        //Objective: To design an algorithm that finds average miles per gallon

        double startOdomReading = 68723;
        double endOdomReading = 71829;
        double gasUsedD1 = 15.75;
        double gasUsedD2 = 16.30;
        double gasUsedD3 = 10.95; 
        double gasUsedD4 = 20.65;
        double gasUsedD5 = 30.00;

        double total_miles;

        total_miles = endOdomReading - startOdomReading;

        double avg_miles_D1 = total_miles / gasUsedD1;
        double avg_miles_D2 = total_miles / gasUsedD2;
        double avg_miles_D3 = total_miles / gasUsedD3; 
        double avg_miles_D4 = total_miles / gasUsedD4;
        double avg_miles_D5 = total_miles / gasUsedD5;

        double avg_miles_per_gallon = ((avg_miles_D1 + avg_miles_D2 + avg_miles_D3 + avg_miles_D4 + avg_miles_D4 + avg_miles_D5)/ 5);

        System.out.println();
        System.out.println("Hello, your system's average miles per gallon for the week is: " + avg_miles_per_gallon + " mpg"); 
    }
}
