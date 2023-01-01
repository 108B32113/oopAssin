package assin14_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Assin14_3
{
   public static void main(String args[]) throws IOException{
      int n1, sum = 0;
      BufferedReader buf;
      String str;
      buf = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Please input a integer:");
      str = buf.readLine();
      n1 = Integer.parseInt(str);

      for(int i=1; i<=n1; i++) {
         sum += i;
      }
      System.out.println("1+2+...+" + n1 + "=" + sum);
   }
}