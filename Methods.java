import java.util.ArrayList;
public class Methods {
    public static void main(String[] args){
        ArrayList<Inhe> h = new ArrayList<>();

        h.add(new Inhe("Ali", "2345"));
        h.add(new Inhe("mohammad ","4567"));
        h.add(new Inhe("Sahar", "8907"));


       System.out.println(
         h.contains(new Inhe("Ali", "2345"))
       );
    } 

}
