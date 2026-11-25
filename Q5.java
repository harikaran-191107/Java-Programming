import java.util.Scanner;
class Division{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the first digit:");
        int a=sc.nextInt();
        System.out.print("Enter the second digit:");
        int b=sc.nextInt();
        int quotient=a/b;
        System.out.print("the divided value is:"+quotient);
    }
}