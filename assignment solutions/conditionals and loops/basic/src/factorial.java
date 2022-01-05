import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int  n=s.nextInt();
        int i=1;
        while (n>0){
             i=i*n;
             n--;
         }
         System.out.println(i);
    }
}
