package chapter2;
import java.util.Scanner;
public class exercise2_6 {
    public static void main(String[] args) {
        double total=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the monthly saving amount : ");
        Double saving=input.nextDouble();

        for (int i = 1; i <= 6; i++) {
           total=(saving + total) * (1+0.00417);
        } 
        System.out.println("After six month, the account value is $"+total);
    }
}
