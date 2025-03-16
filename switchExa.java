import java.util.Scanner;

public class switchExa {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your age? :");
        int userAge = userInput.nextInt();

        switch (userAge) {
            case 3:
                System.out.println("Too young for kindergarten");
                break;
            case 4:
                System.out.println("He can be in kindergarten");
                break;
            default:
                System.out.println("Im not sure");
        }
    }
}
