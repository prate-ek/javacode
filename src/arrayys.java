import java.util.Scanner;
public class arrayys {
    public static void main(String[] args) {
        int [] arr= new int[5];
        Scanner s= new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
    }
}
