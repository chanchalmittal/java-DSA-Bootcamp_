import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD


        Scanner rupees = new Scanner(System.in);
        System.out.print("Enter the rupee: ");
        int R = rupees.nextInt();
        float USD = R/74.19f;
        System.out.print("Rupee in dollar is: " + USD);



    }
}
