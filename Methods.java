public class Methods {
    int a = 12; 
    int b = 15; 
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
        return (double) a / b;
    }
    public static void main(String[] args){
        Methods myMethods = new Methods();
        System.out.println(myMethods.Sum());
         System.out.println("This is my mutltiplicatio : " + myMethods.Multiplication());
         System.out.println("This is my Division: " + myMethods.Division());
         System.out.println("Subtracion : " + myMethods.Subtraction());




    }
}
