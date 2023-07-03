package chapter2;
import java.util.Scanner;
import java.lang.Math;
public class exercise2_5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the length of the side : ");
        Double s=input.nextDouble();

        Double area=((3*Math.sqrt(3))*(s*s))/2;

        System.out.println("The area of hexagon is "+area);
    }
}
