import java.util.Scanner;
public class Interest{

    /*
    Date: 5/27/25
    Author: Jeron Clarke
    Input: APR, Years, PrincpleAmount
    Output: Total amount of Interest
    Description: Prompts the user for APR(percentage), Years typecasted into an integer, and your starting amount in which you return
    the total amount of interest gained over the time period.

    */
    public static void main(String[] args){
     Scanner userInput = new Scanner(System.in);
      double[] myParameters =(getUserInput(userInput));
      double[] myArray = new double [3];
      for(int i = 0;i < myParameters.length;i++){
          myArray[i] = myParameters[i];
      }
      double myInterest = calculateTotalInterest(myArray[0],(int)myArray[1] ,myArray[2]);
      System.out.printf("The total amount of simple interest is %.2f\n",myInterest );
      System.out.println("Jeron Clarke");

    }
    public static double[] getUserInput(Scanner scanner){
        System.out.println("How many years?");
        double numYears = scanner.nextDouble();
        System.out.println("What is your apr?");
        double apr = scanner.nextDouble();
        System.out.println("What is your starting amount?");
        double principleAmount = scanner.nextDouble();
        double[] myParameters = {apr,numYears, principleAmount };
        return myParameters;
    }
    public static double calculateTotalInterest(double apr, int years, double
    amount){

        double myInterest = (apr * (double)years * amount)/100;
        return myInterest;
    }
}
