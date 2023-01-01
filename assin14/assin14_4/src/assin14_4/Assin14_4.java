package assin14_4;

import java.io.*;

public class Assin14_4{
   public static void main(String args[]) throws IOException{
      char data[] = new char[128];
      FileReader FR = new FileReader("/Users/mac/Desktop/assin14/donkey.rtf");
      int num1 = FR.read(data);
      String str = new String(data, 0, num1);
      System.out.println("Characters read= " + num1);
      System.out.println(str);
      FR.close();
   }
}