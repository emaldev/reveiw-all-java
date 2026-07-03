import java.io.File;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AddFile {
    public static void main(String[] args){
        AddFil("test.txt");
        WrieteFile("test.txt");
        RederFile("test.txt");

    }

    public static  void AddFil(String fileName){
        try{
            File myFile = new File("test.txt");
            if(myFile.createNewFile()){
                System.out.println("the file is exist..");
            }else{
                System.out.println("the file is not exist");
            }

            
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    

public static void WrieteFile(String fileName){
    try(FileWriter myFileWriter = new FileWriter("test.txt")){
        myFileWriter.write("Hello Java");
    }catch(IOException e){
        e.printStackTrace();
    }finally{
        System.out.println("File creat and written successfully.");
    }
        
   
}

public static void RederFile(String fileName){
    try{
        File file  = new File("test.txt");
        Scanner input = new Scanner(file);
        while(input.hasNextLine()){
            String note = input.nextLine();
            System.out.println(note);
        }
    }catch(IOException e){
        e.printStackTrace();
    }
    
}

}
