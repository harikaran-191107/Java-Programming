import java.util.Scanner;
class Power{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digit to be powered:");
        int num=sc.nextInt();
        System.out.print("Enter the power:");
        int n=sc.nextInt();
        long ans=1;
        for(int i=0;i<n;i++){
           ans=ans*num;
        }
        System.out.print("the answer after the powered operation is:"+ans);
    }
}