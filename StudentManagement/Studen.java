package StudentManagement;

public class Studen {
    public String id;
    public String name;
    public int age;
    public Studen(String id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override 
    public String toString(){
        return "ID: " + id + ",Name: " + name + ", Age: " + age;
    }
    
}
