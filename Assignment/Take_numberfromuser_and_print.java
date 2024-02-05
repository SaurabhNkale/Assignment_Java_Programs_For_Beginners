package Assignment;

import java.util.Scanner;
public class Take_numberfromuser_and_print {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int x = scanner.nextInt();
        scanner.close();

        System.out.println("Your input Number is "+x);
    }
}
