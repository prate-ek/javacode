import java.util.Scanner;
public class addtwonumbers {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=a+b;
        System.out.println("sum of entered digits =" +c);
    }
}

