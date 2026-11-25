import java.util.Scanner;
class Remainder{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first digit:");
        int a=sc.nextInt();
        System.out.print("Enter the second digit:");
        int b=sc.nextInt();
        int rem=a%b;
        System.out.print("the remainder of the two numbers is:"+rem);
    }
}