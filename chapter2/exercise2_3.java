package chapter2;

import java.util.Scanner;

public class exercise2_3 {
    public static void main(String[] args) {
        double one_lb=0.45359237;
        double one_in=0.0254;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        Double weight=input.nextDouble();
        System.out.print("Enter height in inches : ");
        Double height=input.nextDouble();

        Double tot_w=one_lb*weight;
        Double tot_h=one_in*height;
        
        Double bmi= tot_w/(tot_h*tot_h);
        System.out.println("BMI is "+bmi);
    }
}
