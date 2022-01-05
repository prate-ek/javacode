import java.util.Scanner;
public class ifelseifloop {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int p = n.nextInt();
        if (p > 20) {
            System.out.println("Yes");
        } else if (p < 20) {
            System.out.println("NO");
        } else if (p == 20) {
            System.out.println("Prateek");
        }
        System.out.println("Great job");
    }
}