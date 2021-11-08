import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        //    Area Of Triangle
        System.out.print("Enter the base of triangle: ");
        Scanner b = new Scanner(System.in);
        float base = b.nextFloat();

        System.out.print("Enter the height of triangle: ");
        Scanner h = new Scanner(System.in);
        float height = h.nextFloat();

        double area = 0.5 * base * height;
        System.out.println("The area of triangle is " + area);
    }
}
