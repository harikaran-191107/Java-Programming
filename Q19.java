import java.util.Scanner;
class Celsius{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the farenheit value:");
        int farenheit=sc.nextInt();
        double celsius=((farenheit-32)*5)/9;
        System.out.print("the celsius value is:"+celsius);
    }
}