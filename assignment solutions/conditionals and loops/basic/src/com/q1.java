package com;
//Area Of Circle Java Program
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius,area;
        radius=s.nextDouble();
        if (radius<0){
            System.out.println("Radius cant be negative");
            return;
        }
        area=radius*radius*3.14;
        System.out.println("Area of circle is : "+area);
    }
}
