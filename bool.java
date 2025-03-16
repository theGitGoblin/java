public class bool {

    public static void main(String[] args) {
        boolean myTrueBool = true;

        int x = 2;
        int y = 3;
        boolean isWhat = x >= 2;
        System.out.println(isWhat);

        boolean myFalseBool = false;
        int count = 0;
        while (myTrueBool) {
            count += 1;
            System.out.println("The count is now " + count);
            if (count == 3) {
                System.out.println(
                    "We have hit " + count + " so we must now finish"
                );
                myTrueBool = false;
                /* else if
                 else */

            }
        }
    }
}
