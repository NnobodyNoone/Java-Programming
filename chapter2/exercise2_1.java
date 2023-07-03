package chapter2;
import java.util.Scanner;
public class exercise2_1 {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the radius and length of the cylinder : ");
        Double rad =scan.nextDouble();
        Double len =scan.nextDouble();

        Double area= rad* rad* 3.1415;
        System.out.println(" The area is "+area);
        Double vol= area * len;
        System.out.println(" The volume is "+vol);
    }


}
