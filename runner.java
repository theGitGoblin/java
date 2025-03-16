public class Runner {

    public static void main(String[] args) {
        System.out.println("Hello world");

        int maxNum = 2147483647;
        System.out.println(maxNum + 1);

        long maxEd = maxNum + 1;
        System.out.println((double) Math.pow(2, 31));
        // This is not allowed due to the fact that it is Over the max num
        System.out.printf("Hello friend %s !", maxNum);
        // for printf statements remember the % types, we have %s(string),
    }
}
