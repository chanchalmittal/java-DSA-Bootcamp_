import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

        Scanner number1 = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = number1.nextInt();

        Scanner number2 = new Scanner(System.in);
        System.out.print("Enter the num2: ");
        int num2 = number2.nextInt();

        Scanner operator = new Scanner(System.in);
        System.out.print("Select one out of these operator: +,-,*,/,%:  ");
        char sign = operator.next().charAt(0);

        if (sign == '+' ){
            int sum = num1+num2;
            System.out.println(sum);
        }
        else if (sign == '-'){
            int sum = num1-num2;
            System.out.println(sum);
        }
        else if (sign == '/'){
            float sum = num1/num2;
            System.out.println(sum);
        }
        else if (sign == '*'){
            double sum = num1*num2;
            System.out.println(sum);
        }
        else {
            System.out.println("Invalid input");
        }


    }
}
