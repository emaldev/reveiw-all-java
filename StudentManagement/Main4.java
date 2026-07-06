package StudentManagement;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        System.out.println("------------------{Welcom to the Student File Manager.}-----------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("------------------{Session of Enter number.}-----------------------");
        System.out.println("1.Add Student.");
        System.out.println("2.Show Student.");
        System.out.println("3.Search Student.");
        System.out.println("4.Exit.");
        int number = input.nextInt();
        System.out.println("------------------{Welcom to the Student File Manager.}-----------------------");

        if(number == 1){
            System.out.println("Enter ID: ");
            String id = input.nextLine();
            input.nextLine();
            System.out.println("Enter Name: ");
            String name = input.nextLine();
            System.out.println("Enter Age: ");
            int age = input.nextInt();
        }
        


        
       
    }
    
}
