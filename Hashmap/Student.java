package Hashmap;

public class Student {
    public  String name;
    public String id;
    public int age;

    public Student(String name, String id, int age ){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override 
    public String toString(){
        return "ID: " + id +", Name: " + name + ", Age: " + age;
    }
    
}
