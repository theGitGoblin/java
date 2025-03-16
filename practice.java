public class practice {

    public static void main(String[] args) {
        // Review for java
        // Types first
        // for whole numbers we have
        byte myByte = (byte) 14;
        System.out.println(myByte);
        short myShort = (short) 1234;
        int myInt = (int) 12;
        long myLong = (long) 12;

        // For the floating devimals

        float myFloat = (float) 2.31;
        double myDouble = 23.51293218;

        // Char
        char myChar = 'a';

        // String
        String myString = "Hello world";

        // Operations
        // + -> addition
        // - -> subtraction
        //  / -> floor Division ; To get the actual remainder make sure to cast as a double
        // * -> multiplication , Math.pow(base, exponent) exponential
        //
        double myDivisor = 5 / 2d;
        System.out.println(myDivisor);
        int myDivisio = 5 / 2;
        System.out.println(myDivisio);
        // int discards the decimal
    }
}
