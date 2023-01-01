package assin13_13;

import java.io.*;
class Exception520 extends Exception{
}

public class Assin13_13{
   public static void main(String args[]) throws IOException{
     try{
        String str;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input a string:");
        str = buf.readLine();
        if(str.equals("520")) {
           throw new Exception520();
        }
        else {
           System.out.println("string=" + str);
        }
     }
     catch(Exception520 e){
        System.out.println("這是由字串520所引起的例外");
     }
   }
}