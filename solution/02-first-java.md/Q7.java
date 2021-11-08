import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
      
//       To calculate Fibonacci Series up to n numbers.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
