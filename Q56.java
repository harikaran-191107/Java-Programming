import java.util.Scanner;
class EqualTriangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side1:");
        int a=sc.nextInt();
        System.out.print("Enter the side2:");
        int b=sc.nextInt();
        System.out.print("Enter the side3:");
        int c=sc.nextInt();
        if(a==b && b==c ){
            System.out.print("the given sides forms a equilateral triangle");
        }
        else if(a==b || b==c || c==a){
            System.out.print("the given sides forms a  isoceles triangle");
        }
        else{
            System.out.print("the given sides forms the scalene triangle");
        }
    }
}