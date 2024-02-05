package Assignment;
import java.util.Scanner;

public class Odd_Even_value_check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number ");
        int number = scanner.nextInt();

        if (number %2 ==0){
            System.out.println(number+ " Is a even number");
        }
        else {
            System.out.println(number + " Is a odd number");
        }
        scanner.close();
    }
}
