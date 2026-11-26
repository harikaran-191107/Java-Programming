import java.util.Scanner;
class Area3d{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("volume of cube...");
        System.out.print("Enter the side of the cube:");
        double side=sc.nextDouble();
        double volumecube=Math.pow(side,3);
        System.out.print("the area of the cube is:"+areacube);
        System.out.print("volume of cuboid...");
        System.out.print("Enter the length:");
        double length=sc.nextDouble();
        System.out.print("Enter the breath:");
        double breath=sc.nextDouble();
        System.out.print("Enter the height:");
        double height1=sc.nextDouble();
        double volumecuboid=length+breath+height1;
        System.out.print("the are of the cuboid is:"+areacuboid);
        System.out.print("volume of cone...");
        System.out.print("Enter the radius:");
        double radius=sc.nextInt();
        System.out.print("Enter the height:");
        double height2=sc.nextInt();
        double volumecone=(Math.pow(3.14,2)*radius*height2);
        System.out.print("the area of the cone is"+areacone);
    }
}