public class Exercise2{

    public static void main (String[] args) {
            //Objective: Find the weighted average of 4 test scores
    
           int testscore1, testscore2, testscore3, testscore4;
           double weight1, weight2, weight3, weight4;
           double avg_test_score;
           
           testscore1 = 75;
           testscore2 = 95;
           testscore3 = 85;
           testscore4 = 65;

           weight1 = 0.20;
           weight2 = 0.35;
           weight3 = 0.15;
           weight4 = 0.30;

        
           avg_test_score = ((testscore1 * weight1) + (testscore2 * weight2) + (testscore3 * weight3) + (testscore4 * weight4) / 4);
    

           System.out.println();
           System.out.println("Your average for the class is: " + avg_test_score);
    }
}
