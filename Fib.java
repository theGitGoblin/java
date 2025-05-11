class Fib{
    public static void main(String [] args){
        int step1 = 0;
        int step2 = 1;
        int temp;
        int count = 0;

        while(count <= 10){
            count += 1 ;
            temp = step1 + step2;
            step1 = step2;
            step2 = temp;
            temp = 0;
            System.out.println(step2);
        }

    }
}
