import java.io.File;
import java.io.IOException;

public class FileAdd {
    public static void main(String[] arga){
        try{
            File myFile = new File("Programming.txt");
            if(myFile.createNewFile()){
                System.out.println("File is Created.");
            }else{
                System.out.println("File is not Creat.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    
}
