import java.util.Scanner;
class Grade{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the grade:");
        int Grade=sc.nextInt();
        if(Grade<=100 && Grade>=90){
            System.out.print("the grade is A");
        }
        else if(Grade<=89 && Grade>=80){
            System.out.print("the grade is B");
        }
        else if(Grade<=79 && Grade>=70){
            System.out.print("the grade is C");
        }
        else if(Grade<=69 && Grade>=60){
            System.out.print("the grade is D");
        }
        else{
            System.out.print("the student is fail");
        }
    }
}