public class ExerciseNine {
    //Recursive Method to calculate factorial
    public static int factorial(int x) {
        if (x == 1) { //Base Case
            return 1;
        } else { //Recursive Case
            return x * factorial(x - 1);
        }
    }

    public static void main(String[] args) {
        //Call the recursive method and print the result
        int result = factorial(5);
        System.out.println("The factorial of 5 is: " + result); 
    }

}
