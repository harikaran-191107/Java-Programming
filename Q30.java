import java.util.Scanner;
class Time{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        int sec=sc.nextInt();
        int min=sec/60;
        System.out.println("the number of minutes in the given number of seconds is:"+min);
        int hour=sec/3600;
        System.out.println("the number of hours in the given number of seconds is:"+hour);
        int c=3600*24;
        int days=sec/c;
        System.out.println("the number of days in the given number of seconds is:"+days);

    }
}