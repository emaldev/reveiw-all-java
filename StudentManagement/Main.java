package StudentManagement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> Name = new ArrayList<>();
        Name.add(new Student("9078", "Milad Azimi", 25, "Kabul"));
        Name.add(new Student("6789", "Asef Habibi", 27, "Babakhshan"));
        Name.add(new Student("4567", "Noria Asim", 23, "Tahran"));
        Name.add(new Student("5634", "Anita ", 19, "Mashehad"));

        for(Student i : Name){
            System.out.println(i);
        }
    }
    
}
