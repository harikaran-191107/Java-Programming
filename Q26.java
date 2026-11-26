import java.util.Scanner;
class CI{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Principle amt:");
        double P=sc.nextInt();
        System.out.print("Enetr the rate of intrest:");
        double R=sc.nextInt();
        System.out.print("Enter the time period:");
        double T=sc.nextInt();
        double rate=(100+R)/100;
        double ci=P*Math.pow(rate,T);
        double CI=ci-P;
        System.out.print("the compound intrest is:"+CI);
    }
}