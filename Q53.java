import java.util.Scanner;
class Uppercase{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the character:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.print("the entered character is in uppercase" );
        }
        else{
            System.out.print("the entered character is in lowercase");
        }
    }
}