import java.util.Scanner;
class Positive{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.print("the entered number is positive");
        }
        else if(num<0){
            System.out.print("the entered number is negative");
        }
        else{
            System.out.print("the entered number is zero");
        }
    }  
}
