public class JavaCapsul {
    private String name;
    private int age;

    public String  getName(){
        return name;
    }
    public void setName(String name){
        this.name =  name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age =  age;
    }

    public static void main(String[] args){
        JavaCapsul myCapsul = new JavaCapsul();
        myCapsul.setAge(12);
        myCapsul.setName("MoMo");
        System.out.println(myCapsul.getAge());
        System.out.println(myCapsul.getName());

    }
    
}
