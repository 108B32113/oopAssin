package assin14_10;

import java.io.*;
public class Assin14_10{
   public static void main(String[] args) throws IOException{
      FileWriter FW = new FileWriter("/Users/mac/Desktop/rand.rtf");
      FileWriter FW2 = new FileWriter("/Users/mac/Desktop/rand.rtf2");
      FileReader FR = new FileReader("/Users/mac/Desktop/rand.rtf");
      BufferedWriter BUFW = new BufferedWriter(FW);
      BufferedWriter BUFW2 = new BufferedWriter(FW2);
      BufferedReader BUFR = new BufferedReader(FR);
      String str;
      int i, max, min, arr[]=new int[1000];  long sum = 0L;

      
      for(i=1; i<=1000; i++){
         Double num1 = new Double(Math.random() * 100000);
         str = Integer.toString(num1.intValue());
         BUFW.write(str);  BUFW.newLine();
      }
      BUFW.flush();  FW.close();

      
      i=0; max=0; min=100000;
      while((str = BUFR.readLine()) != null){
         arr[i] = Integer.parseInt(str);
         sum += arr[i];
         if(max<arr[i]) {
            max=arr[i];
         }
         if(min>arr[i]) {
            min=arr[i];
         }
         i++;
      }
      System.out.println("最大值是" + max + ", 最小值是" + min);
      System.out.println("平均值是" + sum/1000);

      
      sort(arr);
      for(i=0; i<1000; i++){
         str=Integer.toString(arr[i]);
         BUFW2.write(str);
         BUFW2.newLine();
      }
      BUFW2.flush();
      FW2.close();
   }

   
   
   
   public static void sort(int[] a){
      int i, j, tem; boolean fla = true;
      for(i=1; (i<a.length)&&(fla==true); i++){
         fla = false;
         for(j=0; j<(a.length-i); j++) {
            if(a[j] > a[j+1]){
               tem=a[j];  a[j]=a[j+1];  a[j+1]=tem;
               fla = true;
            }
         }
      }
      return;
   }
}