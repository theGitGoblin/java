import java.util.Scanner;
public class review{
    public static void main(String[] args){
        System.out.println(" Hello" + " world");
        int myAdd = 2 + 2;
        boolean myStatement = false;
        float myFloat = 2.4156f;
        // float,double (auto casted to double)
        int  newFloat = (int)myFloat;
        // byte,short,int,long
        String myString = "I guess";
        char myChar = 'a';
        // You can add two Chars/ Strings together
        String theNew = "hello" + myChar;
        //  String is the only non-Primitive new type added
        float myPower = (float)Math.pow(2,2.5);
        System.out.println(myPower);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Send me a number please");
        int userNumber = myScanner.nextInt();
        System.out.println(userNumber);

        int[] myArray = {2, 3, 5};
        // Printing out a whole array uses something else


        System.out.println(myArray);
        // next.Int,.Line,.Double,.Boolean,.hasNext,.hasNextInt
        for (int i = 0; i < 10; i++){

            System.out.println("Hello world");
        }

    }
}
