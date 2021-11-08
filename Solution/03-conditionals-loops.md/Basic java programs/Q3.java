import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

//        Area Of Rectangle Program

        System.out.print("Enter the length of Rectangle: ");
        Scanner l = new Scanner(System.in);
        int length = l.nextInt();

        System.out.print("Enter the width of Rectangle: ");
        Scanner w = new Scanner(System.in);
        int width = w.nextInt();

        int area = length * width;
        System.out.println("Area of Rectangle is " + area);

    }
}
