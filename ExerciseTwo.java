import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);

        System.out.print("Enter your name: ");
        String name = scanner.next(); //next() reads a single word (up to the first space)
        System.out.println("Your name is: " + name);

        scanner.nextLine(); //Consume the remaining newline

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();    //nextLine() reads the entire line
        System.out.println("Your full name is: " + fullName);

        scanner.close();

    }
}
