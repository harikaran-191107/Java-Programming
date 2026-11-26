import java.util.Scanner;
class Totalamt{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the price of product1:");
        int prod1=sc.nextInt();
        System.out.print("enter the price of product2:");
        int prod2=sc.nextInt();
        System.out.print("enter the price of product3:");
        int prod3=sc.nextInt();
        System.out.print("enter the price of product4:");
        int prod4=sc.nextInt();
        System.out.print("enter the price of product5:");
        int prod5=sc.nextInt();
        int totalcost=prod1+prod2+prod3+prod4+prod5;
        System.out.print("the total cost of the purchase is:"+totalcost);
    }
}