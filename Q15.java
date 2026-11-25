import java.util.Scanner;
class PerimeterCircle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int radius=sc.nextInt();
        double perimeter=2*(3.14)*radius;
        System.out.print("the perimeter of the circle is:"+perimeter);
    }
}