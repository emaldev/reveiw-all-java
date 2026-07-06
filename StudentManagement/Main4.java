package StudentManagement;
import java.io.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;


public class Main4 {
    public static void main(String[] args){
         System.out.println("-------------Enter File Name:-----------");
        Scanner input = new Scanner(System.in);
        String FileName = input.nextLine();
        AddFile(FileName);


          
            
        System.out.println("------------------{Welcom to the Student File Manager.}-----------------------");
        
        System.out.println("------------------{Session of Enter number.}-----------------------");
        System.out.println("1.Add Student.");
        System.out.println("2.Show Student.");
        System.out.println("3.Search Student.");
        System.out.println("4.Exit.");
        int number = input.nextInt();
        input.nextLine();
        System.out.println("------------------{Welcom to the Student File Manager.}-----------------------");

        if(number == 1){
            System.out.println("Enter ID: ");
            String id = input.nextLine();
            
            System.out.println("Enter Name: ");
            String name = input.nextLine();
            System.out.println("Enter Age: ");
            int age = input.nextInt();

            Studen s = new Studen(id, name, age);
            System.out.println(s);
        }
             
    }
           public static void AddFile(String fileName){
            try{
            
            File myFile = new File(fileName);
            if(myFile.createNewFile()){
                System.out.println("Student added successfully.");
            }else{
                System.out.println("Student file not added successfully.");
            }
            
            }catch(IOException e){
            e.printStackTrace();
            }

          
       
    }
    
}
