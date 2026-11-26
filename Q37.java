import java.util.Scanner;
class GST{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  actual amount:");
        int actualamt=sc.nextInt();
        System.out.print("Enter the tax percentage:");
        int percent=sc.nextInt();
        int extra=(actualamt*percent)/100;
        int gst=actualamt+extra;
        System.out.print("the final amount after GST is:"+gst);
    }
}