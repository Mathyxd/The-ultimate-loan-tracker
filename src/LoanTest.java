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
                    int bValg = Integer.parseInt(scanner.nextLine()) - 1;
                    if (bValg >= 0 && bValg < books.length && books[bValg] != null) {
                        lånte[låntCount] = books[bValg];
                        books[bValg] = null;
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
                    int vValg = Integer.parseInt(scanner.nextLine()) - 1;
                    if (vValg >= 0 && vValg < videos.length && videos[vValg] != null) {
                        lånte[låntCount] = videos[vValg];
                        videos[vValg] = null;
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
                    int eValg = Integer.parseInt(scanner.nextLine()) - 1;
                    if (eValg >= 0 && eValg < electronics.length && electronics[eValg] != null) {
                        lånte[låntCount] = electronics[eValg];
                        electronics[eValg] = null;
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
    }
}
