import java.util.Scanner;
class Farenheit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the celsius value:");
        int celsius=sc.nextInt();
        double farenheit= ((9*celsius)/5)+32;
        System.out.print("the farenheit value is:"+farenheit);
    }
}