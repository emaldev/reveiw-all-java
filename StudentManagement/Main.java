package StudentManagement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> Name = new ArrayList<>();
        Name.add(new Student("9078", "Milad Azimi", 25));
        Name.add(new Student("6789", "Asef Habibi", 27));
        Name.add(new Student("4567", "Noria Asim", 23));
        Name.add(new Student("5634", "Anita ", 19));
        Name.add(new Student("1234", "Alireza", 45));

         System.out.println("This is the list of sudent.");
         System.out.println(" ");
         
          
        for(Student i : Name){
         
            System.out.println(i);
            System.out.println(" ");
           
        }
        System.out.println("Total Student: " + Name.size());
        System.out.println(" ");
       System.out.println(Name.get(3));

       Name.set(2, new Student("1111", "Sahar", 27));
       Name.remove(1);
       System.out.println(" ");
         System.out.println("The List of Student after remove .");
       for(Student st : Name){
        System.out.println(st);
       }
       System.out.println(" ");
       System.out.println(Name.isEmpty());
       System.out.println(" ");

    


    }
    
}
