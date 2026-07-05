package StudentManagement;

public class Student {
    public String id;
    public String name;
    public int age;
    public Student(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Id: " + id + ", Name: " + name + ", Age: " + age;
    }
    
}
