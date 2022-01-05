import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println("minimum value is: "+min(a,b,c));
        System.out.println("maximum value is: "+max(a,b,c));



    }
    public static int max(int a,int b,int c){
        int max=a;
        if (b>max)
            max=b;
        if (c>max)
            max=c;
        return max;
    }
    public static int min(int a,int b,int c){
        int min=a;
        if(b<min)
           min=b;
        if (c<min)
            min=c;
        return min;
    }
}
