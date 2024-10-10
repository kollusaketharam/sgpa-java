import java.util.Scanner;

public class Student {
    String name, usn;
    double SGPA;

    int[] marks = new int[4];
    int[] credits = new int[4];
    double[] gradepoints = new double[4];
    double total = 0, credittotal = 0;

    Scanner sc = new Scanner(System.in);

    void getStudentDetails() {
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter USN:");
        usn = sc.nextLine();
    }

    void getMarks() {
        for (int j = 0; j < 4; j++) {
            System.out.println("Enter " + (j + 1) + " subject marks:");
            marks[j] = sc.nextInt();
            System.out.println("Enter credits for subject " + (j + 1) + ":");
            credits[j] = sc.nextInt();

            gradepoints[j] = (marks[j] / 10.0) + 1; 
            if (gradepoints[j] > 10) {
                gradepoints[j] = 10;
            }
        }
        sc.nextLine(); 
    }

    void computeSGPA() {
        total = 0; 
        credittotal = 0; 
        for (int j = 0; j < 4; j++) {
            total += gradepoints[j] * credits[j];
            credittotal += credits[j];
        }
        SGPA = total / credittotal; 
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("SGPA: " + SGPA);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int numberOfStudents = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            students[i].getStudentDetails();
            students[i].getMarks();
            students[i].computeSGPA();
            students[i].display();
        }
		System.out.println("1BM23CS155");
                System.out.println("K.saketharam");

    }
}