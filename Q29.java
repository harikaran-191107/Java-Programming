import java.util.Scanner;
class Days{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of days:");
        int days=sc.nextInt();
        int years=days/365;
        System.out.println("the number of years comtained in the given days are:"+years);
        int month=days/12;
        System.out.println("the number of months contained in the given days are:"+month);
        int weeks=days/7;
        System.out.print("the number of weeks contained in the given days are:"+weeks);
    }
}