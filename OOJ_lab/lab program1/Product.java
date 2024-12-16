import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        System.out.println("Darshan YG, 1BM23CS087");
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int res = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + res); 

        input.close();
    }
}
