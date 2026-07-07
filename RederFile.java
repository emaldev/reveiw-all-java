import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class RederFile {
    public static void main(String[] args){
        try(FileReader myFile = new FileReader("Programming.txt");
            Scanner input = new Scanner(myFile)){
            while(input.hasNextLine()){
                String note = input.nextLine();
                System.out.println(note);
            }

        }catch(IOException e){
            e.printStackTrace();
            System.err.println("Errro is is " + e.getMessage());
        }
    }
    
}
