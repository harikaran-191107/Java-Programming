import java.util.Scanner;
class Km{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of kilometres to be converted:");
        double km=sc.nextDouble();
        double metre=km*1000;
        System.out.print("the number of metres present in the given kilometre is:"+metre);
    }
}