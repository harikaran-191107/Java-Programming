import java.util.Scanner;
class Discount{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total amt:");
        double totalamt=sc.nextDouble();
        System.out.print("Enter the discount:");
        double disc=sc.nextDouble();
        double finalamt=(totalamt*disc)/100;
        System.out.print("the final amount after discount is"+finalamt);
    }
}