import java.util.Scanner;
class QR{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digit to be calculated:");
        int num=sc.nextInt();
        int quotient=num/10;
        int remainder=num%10;
        System.out.println("the quotient of the given number is:"+quotient);
        System.out.print("the remainder of the given number is:"+remainder);
    }
}