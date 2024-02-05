package Assignment;

public class swap_two_Numbers_using_variable {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;

        System.out.println("Before swapping ");
        System.out.println("First number before swapping " +x);
        System.out.println("Second number before swapping "+y);

        int temp;  // assume third variable as temp
        temp=x;   // First value = temp
        x=y;      // First value = second value
        y=temp;  // second value = temp

        System.out.println("After swapping" );
        System.out.println("First number after swapping "+x);
        System.out.println("Second number after swapping "+y);
    }
}
