import java.util.Scanner;
class Oddoreven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.print("the entered number is even");
        }
        else{
            System.out.print("the entered number is odd");
        }
    }
}