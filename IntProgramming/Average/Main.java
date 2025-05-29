import java.util.ArrayList;

public class Main{
    //
 /*
    5/27/25
    Jeron Clarke
    Input: # of grades the user wants to input
    Output: The average of the list of numbers provided

 */
    public static void main (String[] args){

        System.out.println("Jeron Clarke");
        ArrayList<Double> myGrades = Average.inputGrade();
        double realAverage = Average.getAverage(myGrades);
        double lowestGrade = Average.lowestGrade(myGrades);
        double highestGrade = Average.highestGrade(myGrades);
        System.out.printf("The average of the grades entered is %s \n Highest grade: %s\n Lowest Grade : %s\n", realAverage,highestGrade,lowestGrade);
        System.out.println("Jeron Clarke");


    }
}
