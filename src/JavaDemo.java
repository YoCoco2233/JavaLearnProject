import java.util.Scanner; // Importing the Scanner class for input

public class JavaDemo {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object for input

        // Introducing variables
        int[] numbers = new int[5]; // Declaring and initializing an array
        String name;
        boolean isStudent = true;

        // Input section
        System.out.println("Enter your name:");
        name = scanner.nextLine(); // Reading a line of text

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt(); // Reading an integer and storing it in the array
        }

        // Processing and output section
        System.out.println("Hello, " + name + "!");

        if (isStudent) {
            System.out.println("You are a student.");
        } else {
            System.out.println("You are not a student.");
        }

        // Demonstrating a loop and accessing array elements
        System.out.println("The numbers you entered are:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Demonstrating a method call
        int sum = calculateSum(numbers); // Calling a method and storing the result
        System.out.println("The sum of the numbers is: " + sum);

        scanner.close(); // Closing the scanner to prevent resource leak
    }

    // A method that calculates the sum of an array of integers
    public static int calculateSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum; // Returning the calculated sum
    }
}