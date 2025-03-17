public class Methodz {

    static void helloWorld() {
        System.out.println("hello world!");
    }

    /*
static -> belongs to the main class not an object
void -> means it does not return a value
to call a method make sure to add the args needed and also,
put it in the main method.
*/

    //an example of parameters being included, you must have the data types as well
    public static void myPrintStatement3x(String printstatement) {
        System.out.println(printstatement);
        // void makes sure that no return statement must be done
        System.out.println(printstatement);
        System.out.println(printstatement);
    }

    static double sqrt(double num) {
        return Math.sqrt(num);
    }

    /*
    Method overloading:
        multiple methods with the same name, and different outcomes
        in the example below, it will choose which one fits best for the operation at hand
    */
    static int addition(int x, int y) {
        return x + y;
    }

    static double addition(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        helloWorld();
        myPrintStatement3x("Hi");
        System.out.println(sqrt(5.2));
        int x = (int) sqrt(9.5);
        System.out.println(
            "The answer without the decimals for square root of 9.5 is " + x
        );
    }
}
