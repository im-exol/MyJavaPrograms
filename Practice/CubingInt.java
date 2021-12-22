import java.lang.Math;
import java.util.Scanner;

public class CubingInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base");
        int a = sc.nextInt();
        System.out.println("enter power");
        int b = sc.nextInt();
    //    int CN = sc.nextInt();
       // System.out.println("Square of the given int is : " +(CN*CN));
       // System.out.println("Cube of the given int is : " +(CN*CN*CN));
        System.out.println("the result is : " +(int)(Math.pow(a, b)));
    }
}
