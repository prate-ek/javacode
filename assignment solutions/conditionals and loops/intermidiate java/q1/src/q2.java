import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double bill = 0,kwh,days,costof1kwh,cost;
        System.out.print("Enter the kwh used: ");
        kwh=s.nextDouble();
        System.out.print("Enter the cost of 1kwh: ");
        costof1kwh=s.nextDouble();
        System.out.print("Enter the no. of days: ");
        days=s.nextDouble();
        if (kwh>0 && days>0 && costof1kwh>0){
            cost=costof1kwh*kwh;
            bill=cost/days;
        System.out.print("bill is Rs."+bill);
    }else{
            System.out.println("Invalid Input");
        }
    }
}
