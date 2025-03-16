/*
 A do-while loop will execute one time regardless of the condition, met or not


*/

public class do_while {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("This happens once");
            i++;
        } while (i < 5);
        {
            System.out.println('1');
        }

        // Example 2
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= 10);
        String[] characters = { "a", "b", "c" };

        for (String character : characters) {
            character += " is a letter";
            System.out.println(character);
        }
        int[] arr = { 1, 4, 5, 2, 0, 10, 19 };
        int sum = 0;
        for (int number : arr) {
            sum += number;
            System.out.println(sum);
        }
    }
}
