import java.util.Scanner;
class AreaRectangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        int length=sc.nextInt();
        System.out.print("Enter the breath of the rectangle:");
        int breath=sc.nextInt();
        int area=length*breath;
        System.out.print("the area of the rectangle is:"+area);
    }
    
}
