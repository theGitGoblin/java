import java.util.ArrayList;
public class Main{
    //
 /*
    5/27/25
    Jeron Clarke
    Input: # of grades the user wants to input

 */
    public static void main (String[] args){

        System.out.println("Jeron Clarke");
        ArrayList<Double> myGrades = Average.inputGrade();
        double realAverage = Average.getAverage(myGrades);
        System.out.printf("The average of the grades entered is %s.\n", myGrades);


    }
}
