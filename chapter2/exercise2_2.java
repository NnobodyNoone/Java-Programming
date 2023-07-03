package chapter2;
import java.util.Scanner;
public class exercise2_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter subtotal and gratuity rate: ");
        Double sub=input.nextDouble();
        Double gra=input.nextDouble();

        Double gratuity= sub*gra/100;
        Double total= sub+gratuity;
        System.out.println("The gratuity is $"+gratuity+" and total is $"+total);
    }
}
