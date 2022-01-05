public class functioncalling {
    public static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        int d,e,c;
        d=10;
        e=20;
        c=sum(d,e);
        System.out.println(c);
    }
}
