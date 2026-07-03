import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HashMap<String , Integer> name = new HashMap<>();
        name.put("Ali", 19);
        name.put("Sahar", 21);
        name.put("Ahmad", 17);

      for(Map.Entry<String, Integer> entry: name.entrySet()){
        System.out.println(entry.getKey() + ": " + entry.getValue());
      }
    


    }  
}
