import java.util.Scanner;
class Password{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the password:");
        String pass=sc.nextLine();
        if(pass.equals("hari")){
            System.out.print("entered password is correct");
        }
        else{
            System.out.print("entered password is incorrect");
        }
        
    }
}
