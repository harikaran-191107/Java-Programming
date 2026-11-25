import java.util.Scanner;
class PerimeterSquare{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of a square:");
        int side=sc.nextInt();
        int perimeter=4*side;
        System.out.print("the perimeter of a square is:"+perimeter);
    }
}
