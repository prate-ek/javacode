import java.util.Scanner;


public class functionsfactorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int n=s.nextInt();
        factorial(n);
    }
    public static void factorial(int n){
        int i=1;
        while (n>0){
            i=i*n;
            n--;
    }System.out.print(i);
}
}
