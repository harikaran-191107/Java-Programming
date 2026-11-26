import java.util.Scanner;
class Large1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first element:");
        int a=sc.nextInt();
        System.out.print("Enter the second element:");
        int b=sc.nextInt();
        System.out.print("Enter the third element:");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.print(a+" is greater than the "+b+" and "+c);
        }
        else if(b>c){
            System.out.print(b+" is greater tha the "+a+" and "+c);
        }
        else{
            System.out.print(c+" is greater than the "+a+" and "+b);
        }
    }
}