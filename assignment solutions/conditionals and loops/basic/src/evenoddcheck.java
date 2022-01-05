import java.util.Scanner;

public class evenoddcheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.");
        int num = s.nextInt();
        evenodd(num);
    }


    public static void evenodd(int a) {
        if (a % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
