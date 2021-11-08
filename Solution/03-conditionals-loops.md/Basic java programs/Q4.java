import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
//        Area Of Isosceles Triangle

        System.out.print("Enter the base of an Isosceles Triangle: ");
        Scanner b = new Scanner(System.in);
        float base = b.nextFloat();

        System.out.print("Enter the height of an Isosceles Triangle: ");
        Scanner h = new Scanner(System.in);
        float height = h.nextFloat();

        double area = 0.5 * base * height;
        System.out.print("Area of an Isosceles Triangle is: " + area);
    }
