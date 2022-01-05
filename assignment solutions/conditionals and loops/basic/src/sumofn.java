import java.util.Scanner;

public class sumofn {
    public static void findSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

        }
        System.out.print(sum);


    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no of natural no.: ");
        int  n=s.nextInt();
        findSum(n);

    }

}
