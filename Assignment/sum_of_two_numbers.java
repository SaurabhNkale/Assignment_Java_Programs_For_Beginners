package Assignment;

import java.util.Scanner;

public class sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //take input from user

        System.out.println("Enter first number ");
        // Enter first value

        int a = scanner.nextInt();
        //read 1st number from user

        System.out.println("Enter second number ");
        // Enter second value

        int b= scanner.nextInt();
        // read nd number from user

        scanner.close();
        // Close the scanner

        int sum = a+b;
        // Calculate

        System.out.println("Total of two numbers = " +sum);
        // Print the result
    }
}
