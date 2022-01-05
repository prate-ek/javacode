import java.util.Scanner;
public class whileeloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n <= 12) {
            System.out.println(n);
            n++;
        }
    }
}
