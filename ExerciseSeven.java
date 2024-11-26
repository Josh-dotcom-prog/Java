//Question6: Write a Java program that asks for a password and allows the 
//user 3 attempts to input the correct password using a while loop.

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   

    String correctPassword = "Joshua123";
    int attempts = 3;

    while (attempts > 0) {
        System.out.print("Enter the password: ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(correctPassword)) {
            System.out.println("Success! Correct password entered.");
        } else {
            attempts--;
            System.out.println("Incorrect password. Attempts remaining: " + attempts);
        }
        if (attempts == 0) {
            System.out.println("Account blocked");
        }
    }
    
    scanner.close();

    }
    
}
