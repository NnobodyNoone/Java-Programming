package chapter2;
import java.util.Scanner;
public class exercise2_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the driving distance : ");
        Double dis=input.nextDouble();

        System.out.print("Enter miles per gallon : ");
        Double mpg=input.nextDouble();

        System.out.print("Enter price per gallon : ");
        Double ppg=input.nextDouble();

        Double cost=dis*ppg/mpg;
        System.out.println("The cost of driving is $"+cost);
    }
}
