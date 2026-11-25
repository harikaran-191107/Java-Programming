import java.util.Scanner;
class AreaTriangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of the triangle:");
        int base=sc.nextInt();
        System.out.print("Enter the height of the triangle:");
        int height=sc.nextInt();
        double area=(0.5)*base*height;
        System.out.print("the area of a triangle is:"+area);
    }
}