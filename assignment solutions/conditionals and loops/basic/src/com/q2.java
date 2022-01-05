package com;

import java.util.Scanner;

//Area Of Triangle
public class q2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double height,base,area;
        System.out.print("enter the height of triangle: ");
        height=s.nextDouble();
        System.out.print("Enter the base of triangle: ");
        base=s.nextDouble();
        if (height<0){
            System.out.print("Height cant be negative");
            return;
            }if (base<0){
            System.out.print("base cant be negative");
            return;
        }
        area=0.5*base*height;
        System.out.print("Area of triangle is: "+area);

    }
}
