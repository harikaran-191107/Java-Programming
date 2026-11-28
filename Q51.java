import java.util.Scanner;
class Alphabet{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the alphabet:");
        char alp=sc.next().charAt(0);
        if(alp>='A' && alp<='Z'){
            System.out.print("the entered character is an alphabet");
        }
        else if(alp>='a' && alp<='z'){
            System.out.print("the entered character is an alphabet");
        }
        else{
            System.out.print("the entered character is not an alphabet");
        }
    }
}