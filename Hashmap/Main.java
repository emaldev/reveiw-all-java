package Hashmap;
import java.util.HashMap;
public class Main {
    public static void main(String[] args){
        HashMap<String , Student> name = new HashMap<String , Student>();

        name.put("1", new Student("Ali", "12", 20));
        name.put("2", new Student("Mohammad", "34", 21));
        name.put("3", new Student("Sahar", "89", 19));

        System.out.println(name.get("2"));
        name.remove("1");

        for(String s : name.keySet()){
            System.out.println(name.get(s));
        }
        name.get("3");
        System.out.println(  name.containsKey("2") );
         System.out.println(name.containsValue(new Student("Mohammad", "34", 21)));
         Student s = name.get("2");
         s.age = 25;

         System.out.println(name.get("2"));
       

    }
    
}
