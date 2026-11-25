import java.util.Scanner;
class Square{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the digit to be squared:");
        int num=sc.nextInt();
        int square=num*num;
        System.out.print("the squared number is:"+square);
    }
}