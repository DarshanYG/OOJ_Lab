import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        System.out.println("Darshan YG, 1BM23CS087");
        int a, b, c;
        float disc;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter coefficient of x square:");
        a = input.nextInt();
        
        System.out.println("Enter co-efficient of x:");
        b = input.nextInt();
        
        System.out.println("Enter the constant:");
        c = input.nextInt();
        
        disc = b * b - 4 * a * c;
        
        if (disc < 0) {
            System.out.println("No real roots exist");
        } 
        else if (disc > 0) {
            int root1 = (-b + (int)Math.sqrt(disc)) / (2 * a);
            int root2 = (-b - (int)Math.sqrt(disc)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } 
        else {
            int root1 = (-b) / (2 * a);
            System.out.println("The roots are equal: " + root1);
        }
        
        input.close();
    }
}