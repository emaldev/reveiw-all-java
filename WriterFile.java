import java.io.FileWriter;
import java.io.IOException;
public class WriterFile {
    public static void main(String[] args){
        
        try(FileWriter myFileWriter = new FileWriter("Programming.txt")){
            myFileWriter.write("...................متن که می خواهیم اضافه کنم در فایل ...................");
            System.out.println("نوشتن در فایل با موفقیت انجام شد ");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
