import java.util.Scanner;
class Salary{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the basic salary:");
        double basicsalary=sc.nextDouble();
        System.out.print("Enter the additional allowances:");
        double additional=sc.nextDouble();
        double finalsalary=basicsalary+additional;
        System.out.print("the finalsalary is:"+finalsalary);
    }
}