public class Boolean {

    public static void main(String[] args) {
        boolean isnotDone = true;
        int myCount = 0;
        while (isnotDone) {
            myCount += 1;
            System.out.println("The count is now " + myCount);
            System.out.println(isnotDone);
            if (myCount == 10) {
                isnotDone = false;
                System.out.println(isnotDone);'

                // && -> and , || --> or , ! -> not (can also be used as not);
            }
        }
    }
}
