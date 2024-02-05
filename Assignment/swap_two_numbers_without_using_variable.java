package Assignment;

public class swap_two_numbers_without_using_variable {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;

        System.out.println("Before swapping ");
        System.out.println("First number before swapping " +x);
        System.out.println("Second number before swapping "+y);

        x = x+y; // New x value = 25
        y= x-y;  // New Y value = (15-15)= 10
        x= x-y; // New X value = (25-10)= 15


        System.out.println("After swapping" );
        System.out.println("First number after swapping "+x);
        System.out.println("Second number after swapping "+y);
    }
}
