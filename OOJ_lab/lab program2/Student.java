import java.util.Scanner;

class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;

    void acceptDetails(int numSubjects) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USN: ");
        usn = scanner.nextLine();
        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        credits = new int[numSubjects];
        marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    void displayDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);

        System.out.print("Credits: ");
        for (int c : credits) System.out.print(c + " ");
        System.out.println();

        System.out.print("Marks: ");
        for (int m : marks) System.out.print(m + " ");
        System.out.println();
    }

    double calculateSGPA() {
        double totalCredits = 0;
        double totalGradepoints = 0;

        for (int i = 0; i < credits.length; i++) {
            totalCredits += credits[i];
            totalGradepoints += 0;
        }
        return (totalCredits > 0) ? (totalGradepoints / totalCredits) : 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Darshan YG, 1BM23CS087");

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

                Student[] students = new Student[2];
        for (int i = 0; i < 2; i++) {
            students[i] = new Student();
            System.out.println("\nEntering details of student " + (i + 1) + ":");
            students[i].acceptDetails(numSubjects);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("\nDetails of student " + (i + 1) + ":");
            students[i].displayDetails();
        }
    }
}