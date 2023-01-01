package assin14_2;

import java.util.Scanner;
import java.lang.String;
public class Assin14_2{
   public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      String str;
      System.out.print("Please input a string:");
      str = scn.nextLine();
      System.out.println("Transform the uppercase:" + str.toUpperCase());
   }
}
