
import java.util.Scanner;

public class Num{
    public static void main(String[] args){
        int no = getNumber();
        System.out.printf("The entered number is %d.\n",no);
        System.out.println("Jeron Clarke");
    }
     static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int myInt = scanner.nextInt();
        return myInt;
    }
}
