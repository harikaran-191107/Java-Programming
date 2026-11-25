import java.util.Scanner;
class PerimeterRectangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length of the rectangle:");
        int length=sc.nextInt();
        System.out.print("Enter the width of the rectangle:");
        int width=sc.nextInt();
        int perimeter=2*(length+width);
        System.out.print("the perimeter of the rectangle is:"+perimeter);
    }
}