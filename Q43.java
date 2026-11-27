import java.util.Scanner;
class Large2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first element:");
        int a=sc.nextInt();
        System.out.print("Enter the second element:");
        int b=sc.nextInt();
        if(a>b){
            System.out.print("the first number is greater than the second");
        }
        else{
            System.out.print("the second number is greater than the first");
        }
    }
}