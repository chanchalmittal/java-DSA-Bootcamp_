import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        Scanner principal = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int P = principal.nextInt();

        Scanner rate = new Scanner(System.in);
        System.out.print("Enter the Rate:");
        int R = rate.nextInt();

        Scanner time = new Scanner(System.in);
        System.out.print("Enter the time period:");
        int T = time.nextInt();

        int SI = (P*R*T)/100;

        System.out.println("Simple interest is: "+SI);
    }
}
