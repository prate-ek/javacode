package com.company;

import java.util.Scanner;

//Area Of Rectangle Program
public class q3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double length,breadth,area;
        System.out.print("enter the length of rectangle: ");
        length=s.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        breadth=s.nextDouble();
        if (length<0){
            System.out.print("length cant be negative");
            return;
        }if (breadth<0){
            System.out.print("breadth cant be negative");
            return;
        }
        area=length*breadth;
        System.out.print("area of rectangle is: "+area);
    }
}
