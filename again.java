public class again{
    public static void main(String[] args){

        String[] myArray = {"Hello", "How", "are", "you", "?"};
        String newString = "";

        for(int i = 0; i < myArray.length; i++){
            newString = newString + " " +  myArray[i];
        }
        System.out.println(newString);

        // byte, short , int, long
        // float, double
        // char,string
    }

}
