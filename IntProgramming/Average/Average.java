import java.util.Scanner;
import java.util.ArrayList;

public class Average{
public static ArrayList<Double> inputGrade(){
    boolean moreGrades = true;
    Scanner input = new Scanner(System.in);
    ArrayList<Double> myArray = new ArrayList<>();
    while(moreGrades){
        System.out.println("What grade do you want to enter?: ");
        double myVal = input.nextDouble();
        myArray.add(myVal);
        input.nextLine();
        System.out.println("Are you done? (Y/N): ");
        String myAnswer = input.nextLine();
        if (myAnswer.equalsIgnoreCase("Y")){
            moreGrades = false;
        } }
    return myArray;

}
public static double getAverage(ArrayList<Double> myArray){
    double sum = 0;
    for(double i : myArray){
        sum += i;
    }
    double average = sum / myArray.size();

    return average;
}
public static double highestGrade(ArrayList<Double> theArray){
    double highestNum = 0;
    for(double i: theArray){
        if (i > highestNum){
            highestNum = i;
        }
    }

    return highestNum;
}
public static double lowestGrade(ArrayList<Double> theArray){
    double lowestNum = 100;
    for(double i: theArray){
        if (i < lowestNum){
            lowestNum = i;
        }
    }

    return lowestNum;
}
}
