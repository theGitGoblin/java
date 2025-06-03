import java.util.Scanner;
public class Grading{
    public static void main(String[] args){
        double topGrade,bottomGrade;
        int topGradeIndex = 0 ;
        int bottomGradeIndex = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many students are you making");
        int amountOfStudents = userInput.nextInt();
        Student[] students = new Student[amountOfStudents];
        for( int i = 0; i < amountOfStudents; i++){
            System.out.println("In this order enter a Name, Score, and address");
            String studentName = userInput.nextLine();
            double studentScore = userInput.nextDouble();
            String studentAddress = userInput.nextLine();
            students[i] = new Student(studentName,studentScore,studentAddress);

        }
        topGrade = students[0].getScore();
        bottomGrade = students[0].getScore();

        for(int i = 0; i < students.length; i++){
            if (topGrade < students[i].getScore()){
                topGrade = students[i].getScore();

                topGradeIndex = i;    }
            }
            for(int i = 0; i < students.length; i++){
                if (bottomGrade > students[i].getScore()){
                    bottomGrade = students[i].getScore();
                    bottomGradeIndex = i;    }
                }
            System.out.printf("The top score was %f by %s", students[topGradeIndex].getScore(),students[topGradeIndex].getName() );
            System.out.printf("The botom score was %f by %s", students[bottomGradeIndex].getScore(),students[bottomGradeIndex].getName());
        }


}
