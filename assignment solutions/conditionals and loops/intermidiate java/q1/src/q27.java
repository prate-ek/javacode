import java.util.Scanner;

public class q27 {
//    Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int nSum=0,eSum=0,oSum=0;
    System.out.println("Enter numbers");
    while(true){
    int n=s.nextInt();
    if (n==0){
        break;
    }if (n<0){
        nSum+=n;
    }else if (n%2==0){
        eSum+=n;
    }else {
        oSum+=n;
    }
    System.out.print("negative no. sum: "+nSum);
    System.out.print("even no. sum: "+eSum);
    System.out.print("odd no. sum: "+oSum);
}
}
                                                                                         }

