import java.util.Scanner;
class Volume{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Area of the cube...");
        System.out.print("Enter the side of the cube:");
        double side=sc.nextDouble();
        double lateralarea=4*(Math.pow(side,2));
        double totalarea=6*(Math.pow(side,2));
        System.out.println("the lateralarea of the cube:"+lateralarea);
        System.out.println("the totalarea of the cube:"+totalarea);
        System.out.println("Area of the cuboid...");
        System.out.print("Enter the length of the cuboid:");
        double length=sc.nextDouble();
        System.out.print("Enter the breath of the cuboid:");
        double breath=sc.nextDouble();
        System.out.print("Enter the height of the cuboid:");
        double height=sc.nextDouble();
        double lateralarea1=(2*height)*(length+breath);
        double totalarea1=2*((length*breath)+(breath*height)+(height*length));
        System.out.println("the lateralarea of the cuboid:"+lateralarea1);
        System.out.println("the totalarea of the cuboid:"+totalarea1);
        System.out.println("Area of cube...");
        System.out.print("Enter the radius of the cone:");
        double radius2=sc.nextDouble();
        System.out.print("Enter the length of the cone:");
        double length2=sc.nextDouble();
        double lateralarea2=3.14*length2*radius2;
        double totalarea2=(3.14*radius2)*(length2+radius2);
        System.out.println("the lateralarea of the cone:"+lateralarea2);
        System.out.println("the totalarea of the cone:"+totalarea2);
    }
}