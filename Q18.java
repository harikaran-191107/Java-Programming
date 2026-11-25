import java.util.Scanner;
class PerimeterTriangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the firs side:");
        int a=sc.nextInt();
        System.out.print("Enter the length of second side:");
        int b=sc.nextInt();
        System.out.print("Enter the length of the third side:");
        int c=sc.nextInt();
        int perimeter=a+b+c;
        System.out.print("the perimeter of the triangle is:"+perimeter);
    }
}