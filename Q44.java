import java.util.Scanner;
class Large3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first element:");
        int a=sc.nextInt();
        System.out.print("Enter the second element:");
        int b=sc.nextInt();
        System.out.print("Enter the third element:");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.print("the first element is greater than the other two elements");
        }
        else if(b>c){
            System.out.print("the second element is greater than the other two elements");
        }
        else{
            System.out.print("the third element is greater than the other two elements");
        }
    }
}