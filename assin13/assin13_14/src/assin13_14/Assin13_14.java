package assin13_14;
import java.util.*;
class IntegerTooSmall extends Exception{
}

class IntegerTooLarge extends Exception{
}

public class Assin13_14{
   public static void main(String args[])
   {
     Scanner scn = new Scanner(System.in);
     int num1;
     try{
        System.out.print("請輸入一整數:");
        num1 = scn.nextInt();
        if(num1 < 10) {
           throw new IntegerTooSmall();
        }
        else if(num1 > 70) {
           throw new IntegerTooLarge();
        }
        else {
           System.out.println("num=" + num1);
        }
     }
     catch(IntegerTooSmall e){
        System.out.println("您輸入的整數值太小");
     }
     catch(IntegerTooLarge e){
        System.out.println("您輸入的整數值太大");
     }
     catch(InputMismatchException e){
        System.out.println("您輸入的不是整數");
     }
   }
}