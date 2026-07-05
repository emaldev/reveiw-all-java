package StudentManagement;

public class Student {
    public String id;
    public String name;
    public int age;
    public String from;
    public Student(String id, String name, int age, String from){
        this.id = id;
        this.name = name;
        this.age = age;
        this.from = from;
    }

   @Override 
   public String toString(){
    return "Id: " + id + ",Name: " + name + ", Age: " + age + ",From<Country: " + from;
   }
    
}
