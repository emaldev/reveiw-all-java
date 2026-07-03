import java.util.ArrayList;
public class ArrayListN {
    public static void  main(String[] args){
        ArrayList<Integer> number = new ArrayList<>();
        int sum = 0; 
        for(int i = 1; i <= 5; i++){
            number.add(i);
            sum += i;
        }
        System.out.println("Result : " + sum);


    }
    
}
