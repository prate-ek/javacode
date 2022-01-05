import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int principal,rate,time;
        principal=s.nextInt();
        rate=s.nextInt();
        time=s.nextInt();
       int answer=(principal*rate*time)/100;
       System.out.println("simple intrest=" +answer);
    }
}
