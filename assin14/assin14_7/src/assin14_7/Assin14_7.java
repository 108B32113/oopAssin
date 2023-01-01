package assin14_7;

import java.io.*;
public class Assin14_7
{
   public static void main(String args[]) throws IOException{
      int count = 0;
      String str;
      FileReader FR = new FileReader("/Users/mac/Desktop/assin14/donkey.rtf");
      BufferedReader BUFR = new BufferedReader(FR);

      while((str = BUFR.readLine()) != null){
         if(count == 1) {
            BUFR.skip(14);
         }
         System.out.println(str);
         count++;
      }
      FR.close();
   }
}