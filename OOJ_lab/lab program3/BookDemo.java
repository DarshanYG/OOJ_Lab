import java.util.Scanner;

class Book {
    private String name, author;
    private double price;
    private int numPages;

    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getNumPages() {
        return numPages;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String toString() {
        return "Book: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + numPages;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Darshan YG, 1BM23CS087");
        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Details for book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Pages: ");
            int numPages = scanner.nextInt();
            scanner.nextLine();

            books[i] = new Book(name, author, price, numPages);
        }

        System.out.println("\nBook Details---");
        for (Book book : books) {
            System.out.println(book); 
        }

        scanner.close(); 
    }
}


    