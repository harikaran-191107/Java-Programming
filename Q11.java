import java.util.Scanner;
class AreaCircle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int radius=sc.nextInt();
        double area=3.14*radius*radius;
        System.out.print("the area of the circle is :"+area);
    }
}