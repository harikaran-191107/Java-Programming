import java.util.Scanner;
class ThreeAverage{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first digit:");
        int a=sc.nextInt();
        System.out.print("enter the second digit:");
        int b=sc.nextInt();
        System.out.print("Enter the third digit:");
        int c=sc.nextInt();
        int sum=a+b+c;
        int average=sum/3;
        System.out.print("the average of two number is:"+average);
    }
}