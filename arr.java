public class arr {

    public static void main(String[] args) {
        // to define an array you must put it as  a data type
        int[] myArray = new int[20];
        myArray[4] = 25;
        myArray[9] = 9;
        System.out.println(myArray);
        // Also define multi dimensonal arrays
        int[][] multiarray = { { 2, 3, 4, 5 }, { 9, 2, 3, 4 } };
        System.out.println(multiarray[1][0]);
    }
}
