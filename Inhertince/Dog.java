package Inhertince;

public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override

    public void sound(){
        System.out.println("The animal sound Name: " + name + ", Age: " + age);
    }
    
}
