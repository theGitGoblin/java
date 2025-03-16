public class math {

    public static void main(String[] args) {
        // for the methods in the Math class use Math.methodname();
        // Math.abs abs value
        // Math.pow Exponents
        // Math.random() -> chooses a random number between 0 and 1;
        //
        System.out.println(Math.abs(3210 - 213210));

        System.out.println(Math.random() * 5 + 2); // Gives a random double between between 2 -- 5 , adding gives a lowerbound thin y - x + 1

        //Examples

        int myRandomInt = (int) Math.random() * 10;
        int absolute = (int) Math.abs(Math.pow(9, 8) - Math.pow(8, 9));
        System.out.println(absolute);
        double x = Math.abs((9) - (16)); // Make sure that you always remember that you must take the absolute value otherwise
        // You will just end up with NaN due to negatives not being able to work in java
        double myDistance = Math.pow(x, .5);
        System.out.println(myDistance);

        int mathmax = Math.max(0, 10);
        int mathmin = Math.min(0, 10);
        float mathsqrt = (float) Math.sqrt(2);
        System.out.println(mathsqrt);
    }
}
