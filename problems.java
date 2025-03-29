import java.util.Scanner;

public class problems{
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        // sum of 2 nums
        System.out.println("What is your 1st number: ?");
        int num1 = userInput.nextInt();
        System.out.println("What is your 2nd number: ?");
        int num_2 = userInput.nextInt();
        System.out.println(num_2 + num1);

    }
}
