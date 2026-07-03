import java.util.Scanner;
import java.io.IOException;
public class FileManager {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 number ..");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try{
                 double divide = (double) number1 / number2;
                 System.out.println("Result : " + divide);
        

        }catch(ArithmeticException e){
            System.out.println("Connot divide by zero...");
    
        }finally{
            System.out.println("Program finished.");
        }
    }
    
}
