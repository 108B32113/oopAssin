package assin13_6;

public class Assin13_6 {
	public static void main(String args[]){
	      try{
	         int num1 = 12;
	         int den[] = {12, 0, 3, 0, 0, 4};
	         for(int i=0; i<10; i++) {
	            System.out.println("ans=" + num1/den[i]);
	         }
	      }
	      catch(Exception e){
	         System.out.println("捕捉到例外了");
	      }
	   }
}
