import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
//        Take 2 numbers as input and print the largest number.

        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the 2nd number: ");
        int num2 = input2.nextInt();

        if(num1>num2){
            System.out.println(num1 +" is greater than "+ num2);
        }
        else{
            System.out.println(num2 +" is greater then "+ num1);
        }


    }
}
