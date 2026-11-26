import java.util.Scanner;
class Marks{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the mark in subject1:");
        int s1=sc.nextInt();
        System.out.print("Enter the mark in subject2:");
        int s2=sc.nextInt();
        System.out.print("Enter the mark in subject3:");
        int s3=sc.nextInt();
        System.out.print("Enter the mark in subject4:");
        int s4=sc.nextInt();
        System.out.print("Enter the mark in subject5:");
        int s5=sc.nextInt();
        int total=s1+s2+s3+s4+s5;
        int avg=total/5;
        System.out.println("the total marks:"+total);
        System.out.print("the average marks:"+avg);
    }
}