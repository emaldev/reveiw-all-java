public class Vehicle {

    public void start(){
        System.out.println("Vehicle is starting....");
    }
     
    public static void main(String[] args){
        car mCar  = new car();
        mCar.start();
    }
}
 class car extends Vehicle{
        @Override
        public void start(){
             System.out.println("This is the override class ");
        }
    }

   
    

