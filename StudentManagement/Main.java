package StudentManagement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("2490", "Milad", 23));
        students.add(new Student("9078", "Asef", 27));
        students.add(new Student("4578 ", "Emal Hasanzada", 20));

        for(Student ma : students){
            System.out.println(ma);
        }
    }
    
}
