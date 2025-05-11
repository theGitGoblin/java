public class anothereview{
    public static void main(String[] args){
        int[] myArray = {2, 3, 4, 5};

        for(int i=0;i<myArray.length;i++){
            myArray[i] += Math.pow(3,i);
            System.out.println(myArray[i]);

        }
    }
}
