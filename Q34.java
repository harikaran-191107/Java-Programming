
import java.util.Scanner;
class Power2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to be in power:");
        int power=sc.nextInt();
        System.out.print("Enter the number to be powered:");
        int num=sc.nextInt();
        double ans=Math.pow(num,power);
        System.out.print("the result is "+ans); 
    }
}