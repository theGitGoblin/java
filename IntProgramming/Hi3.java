public class Hi3{
    public static void main(String[] args){
        String message = "Hi";
        String name = "James";
        greetingWithMessageName(message, name);
    }
    static void greetingWithMessageName(String m, String n){
        System.out.printf("%s %s!\n",m,n);
    }
}
