import java.util.Scanner;

public class SumBetweenIntegers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] myInput = getUserInput(scanner);
        sumTwoIntegers(myInput[0],myInput[1]);



    }
    public static int[] getUserInput(Scanner scanner){
        System.out.println("What are your two numbers");
        int myFirst = scanner.nextInt();
        int mySecond = scanner.nextInt();
        int[] myArray = {myFirst,mySecond};
        return myArray;
    }

    public static  int sumTwoIntegers(int start, int end){
        int sum = 0;
        if (start > end){
            for (int i = end; i <= start; i++){
                sum += i;
            }
        }
        else{
            for (int i = start; i <= end; i++){
                sum += i;
            }
        }
        System.out.printf("The sum of %d to %d = %d\n",start,end,sum);
        return sum;
    }
}
