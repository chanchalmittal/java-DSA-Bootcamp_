import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
//        Write a program to print whether a number is even or odd, also take input.


        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        if(number % 2 == 0){
            System.out.println("Entered number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }
    }
}
