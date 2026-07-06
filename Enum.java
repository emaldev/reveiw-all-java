
         
   enum orderStatus{
        PENDING,
        PREPARING,
        DELINCELLED,
        CANCILLED;


    }
    public class Enum {
     public static void main(String[] args){
        ORstatuse myORstatuse = new ORstatuse("1002", orderStatus.PENDING);
        System.out.println(myORstatuse.status);
        
       orderStatus order = orderStatus.PENDING;
       orderStatus or = orderStatus.DELINCELLED;
       System.out.println(order);
       System.out.println(or);


    }

    
}
