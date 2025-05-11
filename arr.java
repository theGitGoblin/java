import java.util.ArrayList;
import java.util.Arrays;
public class arr {

    public static void main(String[] args) {
        // to define an array you must put it as  a data type (holds only 1 type)
        int[] myArray = new int[20];
        myArray[4] = 25;
        myArray[9] = 9;
        System.out.println(myArray);
        // Also define multi dimensonal arrays
        int[][] multiarray = { { 2, 3, 4, 5 }, { 9, 2, 3, 4 } };
        System.out.println(multiarray[1][0]);
        /*
         Arrays must be in continous lines in memory for JAVA (non-dynamic), so therefore this means once declared no more spots can be added
         Starts at 0, (Duh)

         can declare using
         int[] myex
         or int myexample[]
        */

        int myex[] = new int [3];
        myex[0] = 3;
        //or
        //double myExample[];

        for(int i = 0; i < multiarray.length; i++ ){
            System.out.println(multiarray[i][i + 1]);
        }
        // Enhanced forloop
        String[] listOfNames = {"jay","steven", "Micheal", "reeves"};
        System.out.println(Arrays.toString(listOfNames));

        for(String names: listOfNames){
            System.out.println(names);
        }
        /* ArrayLists
            Dynamic in nature due to the fact that it will create a nw array and delete the old one and move everything over so no direct size must be given
            */

            ArrayList<Integer> myChannel = new ArrayList<>(10);

            myChannel.add((3));
            System.out.println(Arrays.toString(myChannel.toArray()));
            // What ended up happening is we changed the ArrayList to an Array and transported that into a string




    }
}
