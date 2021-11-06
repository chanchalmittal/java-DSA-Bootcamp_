import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that name

        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Hello " +name);
    }
}
