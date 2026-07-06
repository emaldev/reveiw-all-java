import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     try{
       Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      int b = input.nextInt();
      double divide = (double) a / b;
      
      System.out.println(divide);
     }catch(ArithmeticException e){

        System.out.println("Connot divide by zero!");
        
        e.printStackTrace();
      }catch(InputMismatchException e){
        System.out.println("Invalid input!");
      }
       finally{
      System.out.println("finish program.");
     }
    
    } 
} 

