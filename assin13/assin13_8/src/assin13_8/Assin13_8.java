package assin13_8;
class Ctest{
   public static void test(int num1,int den) throws ArithmeticException{
      System.out.println(num1 + "/" + den + "=" + num1/den);
   }
}

public class Assin13_8{
   public static void main(String args[]){
     try{
        Ctest.test(5, 0);
     }
     catch(ArithmeticException e){
        System.out.println("°Divisor is 0.");
     }
     finally{
        System.out.println("main() has ended.");
     }
   }
}