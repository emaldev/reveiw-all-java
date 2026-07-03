public class Divece {
   String brand;
   public Divece(String brand){
    this.brand = brand;
   }
   public  void displayInfo(){
    System.out.println("This is the divice class ");
    System.out.println("Brand: " + brand);
   }

   public static void main(String[] args){
    Divece myDivece = new Divece("HP");
    Smartphone mySmartphone = new Smartphone("Apple ", "Xiomi");

    myDivece.displayInfo();
    mySmartphone.PlayList();

   }

    
}

 class Smartphone extends Divece{
    String model;
    public Smartphone(String model, String brand ){
         super(brand);
        this.model = model;
        

    }
    public  void PlayList(){
        System.out.println("This is the smart class ");
        System.out.println("Model: " + model + ", Brand: " + brand);
    }
}
