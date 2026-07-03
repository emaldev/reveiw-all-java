public class oop {
    String brand;
    int year;

    public oop(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public  void displayInfo(){
        System.out.println("Brand: " + brand + ", Model: " + year);
    }

    public static void main(String[] args){
        oop myOop = new oop("BMW", 2026);
        myOop.displayInfo();
    }
    
}
