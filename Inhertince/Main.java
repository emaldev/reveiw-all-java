package Inhertince;

public class Main {
    public static void main(String[] args){
        Animal mAnimal = new Animal("Cat", 5);
        Dog mDog = new Dog("Buddy", 3);

        mAnimal.sound();
        mDog.sound();
    }
    
}
