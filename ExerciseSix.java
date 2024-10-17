import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();
            
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
    
    public static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}
