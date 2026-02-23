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

        Video[] videos = {
                new Video("Intro to robotics", 5, 48),
                new Video("Robotics for intermediate", 5, 62),
                new Video("Robotics for pros", 5, 78)
        };

        Electronics[] electronics = {
                new Electronics("Laptop", 3, 7999.95),
                new Electronics("Tablet", 3, 1999.95),
                new Electronics("Webcamera", 3, 499.95)
        };

        System.out.print("Hvor mange ting vil du låne? ");
        int antal = Integer.parseInt(scanner.nextLine());
        int låntCount = 0;

        while (låntCount < antal) {
            System.out.print("Vælg type af objekt du vil låne (book/video/electronic): ");
            String type = scanner.nextLine().toLowerCase();

            switch (type) {
                case "book":
                    System.out.println("Tilgængelige bøger:");
                    for (int i = 0; i < books.length; i++) {
                        if (books[i] != null) {
                            System.out.println((i + 1) + ": " + books[i].getDescription());
                        }
                    }
                    System.out.print("Vælg en bog (1-3): ");
                    int bVal = Integer.parseInt(scanner.nextLine()) - 1;
                    if (bVal >= 0 && bVal < books.length && books[bVal] != null) {
                        lånte[låntCount] = books[bVal];
                        books[bVal] = null;
                        låntCount++;
                    } else {
                        System.out.println("Ugyldigt valg eller allerede lånt. Prøv igen.");
                    }
                    break;

                case "video":
                    System.out.println("Tilgængelige videoer:");
                    for (int i = 0; i < videos.length; i++) {
                        if (videos[i] != null) {
                            System.out.println((i + 1) + ": " + videos[i].getDescription());
                        }
                    }
                    System.out.print("Vælg en video (1-3): ");
                    int vVal = Integer.parseInt(scanner.nextLine()) - 1;
                    if (vVal >= 0 && vVal < videos.length && videos[vVal] != null) {
                        lånte[låntCount] = videos[vVal];
                        videos[vVal] = null;
                        låntCount++;
                    } else {
                        System.out.println("Ugyldigt valg eller allerede lånt. Prøv igen!");
                    }
                    break;

                case "electronic":
                    System.out.println("Tilgængelige elektronik:");
                    for (int i = 0; i < electronics.length; i++) {
                        if (electronics[i] != null) {
                            System.out.println((i + 1) + ": " + electronics[i].getDescription());
                        }
                    }
                    System.out.print("Vælg en elektronik (1-3): ");
                    int eVal = Integer.parseInt(scanner.nextLine()) - 1;
                    if (eVal >= 0 && eVal < electronics.length && electronics[eVal] != null) {
                        lånte[låntCount] = electronics[eVal];
                        electronics[eVal] = null;
                        låntCount++;
                    } else {
                        System.out.println("Ugyldigt valg eller allerede lånt. Prøv igen!");
                    }
                    break;

                default:
                    System.out.println("Ugyldig type, prøv igen.");
                    break;
            }
        }

        sortLoanItemsByTitle(lånte, låntCount);

        printLoanedItems(lånte, låntCount);

        scanner.close();
    }

    public static void sortLoanItemsByTitle(LoanItem[] lånte, int låntCount) {
        for (int i = 0; i < låntCount - 1; i++) {
            for (int j = 0; j < låntCount - 1 - i; j++) {
                if (lånte[j].getTitle().compareToIgnoreCase(lånte[j + 1].getTitle()) > 0) {
                    LoanItem temp = lånte[j];
                    lånte[j] = lånte[j + 1];
                    lånte[j + 1] = temp;
                }
            }
        }
    }

    public static void printLoanedItems(LoanItem[] lånte, int låntCount) {
        System.out.println();
        System.out.println("A sorted list of the items you have loaned!");
        for (int i = 0; i < låntCount; i++) {
            System.out.println("Title: " + lånte[i].getTitle() +
                    ", Loan days: " + lånte[i].getLoanDays());
            System.out.println("Late fee per late day: " +
                    lånte[i].calculateLateFees() + " kr");
        }
        System.out.println();
        System.out.println("Summary:");
        System.out.println("You borrowed " + låntCount + " items today.");
    }
}



