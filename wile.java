import java.util.Scanner;
public class wile{
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your name:");
                String name = sc.nextLine();
                System.out.println("Hello, " + name + " Welcome to the GeeksforGeeks.");
                double fakeFloat = 3.9;
                int notFakeint = (int) fakeFloat;
                System.out.println(notFakeint);
                int myArray[] = new int[3];
                myArray[0] = 1;
                myArray[2] = 69;
                myArray[1] = 2;
                int sum = 0;
                for (int i = 0;  i < myArray.length; i++){
                    sum += myArray[i];
                }
                System.out.println(sum);
        }
}
