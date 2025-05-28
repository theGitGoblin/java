import java.util.Scanner;
public class AddTwoIntegers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int myNum1 = scanner.nextInt();
        int myNum2 = scanner.nextInt();
        int myAddition = add(myNum1,myNum2);
        System.out.printf("%d + %d = %d\n", myNum1,myNum2,myAddition);
    }
    public  static  int add(int num1, int num2){
        return num1 + num2;
    }
}
