import java.util.Scanner;

public class digitfrequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,d,f;
        n=s.nextInt();
        d=s.nextInt();
        f=getDigitFrequency(n,d);
        System.out.print(f);

    }
    public static int getDigitFrequency(int n,int d){
        int count=0;
        while (n>0){
            int rem=n%10;
            if(rem==d){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}
