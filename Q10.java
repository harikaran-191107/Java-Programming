import java.util.Scanner;
class Cube{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digit to be cubed:");
        int num=sc.nextInt();
        int cube=num*num*num;
        System.out.print("the cubed number is:"+cube);
    }
}