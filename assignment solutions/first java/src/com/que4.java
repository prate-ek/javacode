package com;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class que4 {
    public static void main(String[] args) {
        double num1,num2,answer;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first no. : ");
        num1= s.nextDouble();
        System.out.print("Enter the second no. : ");
        num2=s.nextDouble();
        System.out.println("Enter the operator(+,-,*,/)");
        String operator=s.next();
        answer=0;
        if (operator.equals("+")){
            answer=num1+num2;
        }else if (operator.equals("-")){
            answer=num1-num2;
        }else if (operator.equals("*")){
            answer=num1*num2;
        }else if (operator.equals("/")){
            answer=num1/num2;
        }else{
            System.out.println("Your operation is wrong");
            return;
        }System.out.println("the result is : "+ answer);
    }
}


