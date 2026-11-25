import java.util.Scanner;
class Difference{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first digit:");
        int a=sc.nextInt();
        System.out.print("Enter the second digit:");
        int b=sc.nextInt();
        int diff;
        if(a>b){
            diff=a-b;
        } 
        else{
            diff=b-a;
        }
        System.out.print("the diffference is:"+diff);
    }
}