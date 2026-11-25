import java.util.Scanner;
class AreaSquare{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of each side:");
        int side=sc.nextInt();
        int area=side*side;
        System.out.print("the area of the square is:"+area);
    }
}