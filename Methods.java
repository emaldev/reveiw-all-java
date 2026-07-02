public class Methods {
    int a;
    int b;
    public Methods(int a, int b){
        this.a = a;
        this.b = b;
    }
    public  int Sum(){
        return a + b;
    }
    public int Subtraction(){
        return a - b;
    }
    public int Multiplication(){
        return a * b;

    } 
    public double Division(){
        
        if(b == 0){
          System.out.println("The seconde number is zero ");
          return 0.0;
        }else{
           return (double) a / b;
        }
       
    }
    public static void main(String[] args){
        Methods myMethods = new Methods(12, 32);
        System.out.println(myMethods.Sum());
         System.out.println("This is my mutltiplicatio : " + myMethods.Multiplication());
         System.out.println("This is my Division: " + myMethods.Division());
         System.out.println("Subtracion : " + myMethods.Subtraction());

    


    }
}
