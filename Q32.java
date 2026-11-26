import java.util.Scanner;
class Cm{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of metres to be converted: ");
        double metre=sc.nextDouble();
        double cm=metre*100;
        double mm=metre*1000;
        System.out.println("the number of centimetre converted is:"+cm);
        System.out.print("the number of millimetres converted is:"+mm);
    }
}