import java.util.Scanner;
class Multiply{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first digit:");
        int a=sc.nextInt();
        System.out.print("Enter the second digit:");
        int b=sc.nextInt();
        int product=a*b;
        System.out.print("the product of two numbers is:"+product);
    }

}