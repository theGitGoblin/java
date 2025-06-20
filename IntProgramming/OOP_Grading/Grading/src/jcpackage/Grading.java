package jcpackage;
import java.util.Scanner;
import java.util.ArrayList;
public class Grading{
    // Jeron Clarke
    // Input: Faculty member's first and last name, number of students, each student's name, score, and street address.
    // Output: The student with the highest score, their name, score, street address, and the faculty member's name.
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the first name of the faculty member:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the last name of the faculty member:");
        String lastName = scanner.nextLine();
        Faculty faculty = new Faculty(firstName, lastName);
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            String studentName = scanner.nextLine();
            System.out.println("Enter the score of student " + (i + 1) + ":");
            int studentScore = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Enter the street address of student " + (i + 1) + ":");
            String streetAddress = scanner.nextLine();
            students.add(new Student(studentName, studentScore, streetAddress));
        }
        
        
        if (!students.isEmpty()) {
            Student topStudent = students.get(0);
            for (Student s : students) {
                if (s.getScore() > topStudent.getScore()) {
                    topStudent = s;
                }
            }
            System.out.println("\nThe student with the highest score is:");
            System.out.println("Name: " + topStudent.getName());
            System.out.println("Score: " + topStudent.getScore());
            System.out.println("Address: " + topStudent.getStreetAddress());
            System.out.println("Faculty Member: " + faculty.getFirstName() + " " + faculty.getLastName());
        } else {
            System.out.println("No students entered.");
        }
        System.out.println("Jeron Clarke");
    }
}