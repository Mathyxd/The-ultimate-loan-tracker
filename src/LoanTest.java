import java.util.Scanner;

public class LoanTest {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    LoanItem[] lånte = new LoanItem[9];

    Book[] books = {
            new Book("Java: Programming for beginners", 7, "John Smith"),
            new Book("Python for dummies", 7, "Bryan Adams"),
            new Book("C# for pros", 7, "Lisa Perkins")
    };

    Video[] video = {
            new Video("Intro to robotics", 5, 48),
            new Video("Robotics for intermedite", 5, 62),
            new Video("Robotic for pros", 5, 78)
    };

    Electronics[] electronics = {
            new Electronics("Laptop", 3, 7999.95),
            new Electronics("Tablet", 3, 1999.95),
            new Electronics("Webcamera", 3, 499.95)
    };
        System.out.print("Hvor mange ting vil du låne?");
        int antal = Integer.parseInt(scanner.nextLine());
        int låntCount = 0;


    }
}
