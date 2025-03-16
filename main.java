import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hi mom");

            int myNum;
            Scanner userInput = new Scanner(System.in);
            System.out.println("How many times do i say hello?");

            int numHello = userInput.nextInt();

            for (int x = 0; x < numHello; x++) {
                if (x == 2) {
                    break;
                }
                System.out.println("Man i hate java sometimes");
            }
        }
    }
}
