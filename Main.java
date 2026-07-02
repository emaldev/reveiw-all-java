import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
          
        String NameOfList;
        for(int i = 0; i < 5; i++){
            System.out.println("Enter list name of" + (i + 1) + ": ");
            NameOfList = input.nextLine();
            list.add(NameOfList);
        }
        
           
        System.out.println("Your List of :");
        for(String i: list){
            System.out.println("List of \n "+ i); 
        }
        System.out.println("REmoved");
        list.remove(3);
        System.out.println("New List:");
        for(String b : list){
            System.out.println(b);
        }

         
    }
    
}
