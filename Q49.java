import java.util.Scanner;
class Vote{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.print("eligible to vote");
        }
        else{
            System.out.print("not eligible to vote");
        }
    }
}