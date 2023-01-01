package assin13_15;

import java.io.*; import java.math.*;
class ArgumentOutOfBound extends Exception{
}

public class Assin13_15{
   public static void main(String args[]) throws IOException{
      BufferedReader buf;
      String str;
      int num1;
      buf = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("請輸入一大於0的整數:");
      str = buf.readLine();
      num1 = Integer.parseInt(str);
      squareroot(num1);
   }

   public static void squareroot(int n){
      try{
         if(n < 0) {
            throw new ArgumentOutOfBound();
         }
         else{
            System.out.println("平方根(" + n + ")=" + Math.sqrt(n));
         }
      }
      catch(ArgumentOutOfBound e){
         System.out.println(n + "小於0");
      }
   }
}
