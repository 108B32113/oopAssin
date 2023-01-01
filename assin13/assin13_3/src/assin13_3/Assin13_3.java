package assin13_3;

public class Assin13_3 {
	public static void main(String args[]){
	      try{
	         int num1 = 12, den = 0;
	         int ans = num1 / den;
	         System.out.println("ans=" + ans);
	      }
	      catch(ArithmeticException e){
	         System.out.println("Divisor is 0.");
	      }
	      finally{
	         System.out.println("main() has ended.");
	      }
	   }
}
