import java.util.Scanner;

public class IT24104102Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdNumber = input.nextInt();

        System.out.println("\nUser entered numbers are: " + firstNumber + " " + secondNumber + " " + thirdNumber);

        int smallest = firstNumber;
        int largest = firstNumber;

        if (secondNumber < smallest) {
            smallest = secondNumber;
        }
        if (secondNumber > largest) {
            largest = secondNumber;
        }

        if (thirdNumber < smallest) {
            smallest = thirdNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }

        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        input.close();
    }
}