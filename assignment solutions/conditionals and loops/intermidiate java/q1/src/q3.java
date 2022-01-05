import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
//        Calculate Average Of N Numbers
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n=s.nextInt();
        int sum=0;
        System.out.println("Enter the "+n+" elements respectively :");
        for (int i = 0; i < n ; i++) {
            int num=s.nextInt();
            sum+=num;
        }
        double average =(double)sum/n;
        System.out.println(average);
    }
}
