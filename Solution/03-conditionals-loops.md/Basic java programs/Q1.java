import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
      
//       Area Of Circle Java Program
        System.out.print("Enter the radius of the circle: ");
        Scanner radii = new Scanner(System.in);
        float r = radii.nextFloat();

        double cir = 3.14 * r * r;
        System.out.println(cir);


    }
}
