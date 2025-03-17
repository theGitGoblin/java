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
        System.out.println(printstatement);
        System.out.println(printstatement);
    }

    public static void main(String[] args) {
        helloWorld();
        myPrintStatement3x("Hi");
    }
}
