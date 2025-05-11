import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class arraypractice{
    public static void main(String[] args){
        // lets create a new ArrayList
        String myString;
        ArrayList<String> myArray = new ArrayList<>(1);
        boolean isDone = false;
        Scanner myScanner = new Scanner(System.in);
        while(!isDone){
            System.out.println("What String do you want to add?");
            myString = myScanner.nextLine();
            myArray.add(myString);
            System.out.println("Are you done? (Y/N)");
            myString = myScanner.nextLine();
            if(myString.equalsIgnoreCase( "Y")){
                break;
            }
        System.out.println(Arrays.toString(myArray.toArray()));
        }
    }
}
