import java.util.Scanner;
class TwoAverage{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first digit:");
        int a=sc.nextInt();
        System.out.print("enter the second digit:");
        int b=sc.nextInt();
        int sum=a+b;
        int average=sum/2;
        System.out.print("the average of two number is:"+average);
    }
}