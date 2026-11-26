import java.util.Scanner;
class Large{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first element:");
        int a=sc.nextInt();
        System.out.print("Enter the second element:");
        int b=sc.nextInt();
        if(a>b){
            System.out.print(a+" is the largest element and "+b+" is the smallest element");
        }
        else{
            System.out.print(b+" is the largest element and "+a+" is the smallest element");
        }
    }
}