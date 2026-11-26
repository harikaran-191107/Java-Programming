import java.util.Scanner;
class SI{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principle amount:");
        int P=sc.nextInt();
        System.out.print("Enter the rate of intrest:");
        int R=sc.nextInt();
        System.out.print("Enter the time period:");
        int T=sc.nextInt();
        int SI=(P*R*T)/100;
        System.out.print("the simple intrest is:"+SI);
    }
}