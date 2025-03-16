public class Text {

    public static void main(String[] args) {
        System.out.println("Hello World");
        // String Concatenation uses +
        String x = "21321";
        String txt = "hello";
        String y = "231203210";
        char a = 'a';
        String an = a + x;
        System.out.println(x + a);
        System.out.println(an.length());
        /*Special Characters
          \n -> New line
         \" Quotation marks
         t -> tab
         r Carriage return
        b -> backspace For Exmaple: */
        System.out.println("Donald Duck said: \"Quack\" ");
        System.out.println();
        // Method
        //_____________________________________________
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        int indexing = txt.indexOf("e");
        int txtlength = txt.length();
        x.concat(y);
        System.out.println(x.concat(y));
        // '+' is used for concatenation and addition
        // Adding a string and a number results in a String ***
    }
}
