import java.util.Scanner;

public class Grading{
    public static void main(String[] args){
        double studentGrade;
        //String studentHouse;
        String studentName;
        double[] myGrades;String[] studentNames;
        //String[] studentAddress;
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many students do you have?" );
        final int numStudents = userInput.nextInt();
        myGrades = new double[numStudents];
        studentNames = new String[numStudents];
        //studentAddress = new String[numStudents];

        for(int i = 0; i < numStudents; i++){
            System.out.println("What is your  next student's name?");
            studentName = userInput.next();
            studentNames[i] = studentName;

            /*System.out.println("What is your student's address?");
            studentAddress = userInput.nextString();
            studentHouse[i] = studentAddress; */

            System.out.println("What grade did your student make in the class");
            studentGrade = userInput.nextDouble();
            myGrades[i] = studentGrade;
            userInput.nextLine();
        }
        int indexLS = getLowestGrade(myGrades);
        int indexHS = getHighestGrade(myGrades);
        System.out.printf("The student with the highest Score is %s, with a score of %f. \n", studentNames[indexHS] ,myGrades[indexHS]);
        System.out.printf("The student with the lowest Score is %s, with a score of %f. \n", studentNames[indexLS] ,myGrades[indexLS]);
    }
    public static int getHighestGrade(double[] userArray){
        double highestScore = userArray[0];
        int indexOfhighestScore = 0;

        for(int i = 0; i <userArray.length; i++){
            if(highestScore < userArray[i]){
                highestScore = userArray[i];
                indexOfhighestScore = i;
            }

        }
        return indexOfhighestScore;}


    public static int getLowestGrade(double[] userArray){
        double lowestScore = userArray[0];
        int indexOfLowestScore = 0;

        for(int i = 0; i <userArray.length; i++){
            if(lowestScore > userArray[i]){
                lowestScore = userArray[i];
                indexOfLowestScore = i;
            }

        }
        return indexOfLowestScore;}
}
