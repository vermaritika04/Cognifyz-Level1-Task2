import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
            System.out.print("Enter the number of rows for the pyramid: ");
            int rows = scanner.nextInt();
            
            // Outer loop for rows
            for (int i = 1; i <= rows; i++) {
                // Inner loop 1 for spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                // Inner loop 2 for stars
                for (int k = 1; k <= i * 2 - 1; k++) {
                    System.out.print("*");
                }
                // Move to the next line after each row
                System.out.println();
            }
            
            System.out.print("Do you want to try again? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        System.out.println("Goodbye!");
        scanner.close();
    }
}
