import java.util.Scanner;
class Triangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side1:");
        int a=sc.nextInt();
        System.out.print("Enter the side2:");
        int b=sc.nextInt();
        System.out.print("Enter the side3:");
        int c=sc.nextInt();
        if(a+b+c==180){
            System.out.print("the given sides forms a triangle");
        }
        else{
            System.out.print("the given sides does not forms the triangle");
        }
    }
}