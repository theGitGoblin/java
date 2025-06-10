package jcquizone;
public class QuizMain {
    public static void main(String[] args){
        UzumakiClan naruto = new UzumakiClan("Naruto");
        UchihaClan sasuke = new UchihaClan("Sasuke");
        System.out.print("My name is " );
        naruto.displayName();
        System.out.print("My clan is " );
        naruto.displayClan();
        System.out.println();
        System.out.print("My name is " );
        sasuke.displayName();
        System.out.print("My clan is " );
        sasuke.displayClan();

    }

}
