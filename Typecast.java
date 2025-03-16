/*
There are two forms of Type casting in java

Widening -> which is going from a smaller type to a larger type which happens automatically,
or
Narrowing -> which is going from a larger data type to a smaller one (Manual)
(Ex: going from a double to a int)

PS : to declare a constant in java use the word FINAL
*/

public class Typecast{
    public static void main(String [] args){
        final double myDouble = 3.14519;

        int doubleREDO = (int)myDouble;

        System.out.println(doubleREDO);

    }
}
