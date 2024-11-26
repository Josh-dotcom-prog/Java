public class ExerciseTwelve {
    //Method Overloading example
    //Method to display an integer
    public static void display(int number) {
        System.out.println("The number is: " + number);
    }

    //Overload method to display a string
    public static void display(String text) {
        System.out.println("The text is: " + text);
    }

    public static void main(String[] args) {
        //Call the methods
        display(42);
        display("Joshua");
    }
    
}
