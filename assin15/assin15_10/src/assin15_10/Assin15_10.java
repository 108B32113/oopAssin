package assin15_10;

class CTest implements Runnable
{
   private String id;
   public CTest(String str){
      id = str;
   }
   public void run(){
      for(int i=1; i<=5; i++){
         try{
            Thread.sleep((int)(2000 * Math.random()));
         }
         catch(InterruptedException e){
         }
         System.out.println(id + " " + i);
      }
   }
}

public class Assin15_10{
   public static void main(String[] args){
      CTest hello = new CTest("Hello");
      CTest bye = new CTest("Good bye");
      CTest Gmorning = new CTest("Good morning");
      CTest Gnight = new CTest("Good night");
      Thread t1=new Thread(hello);
      Thread t2=new Thread(bye);
      Thread t3=new Thread(Gmorning);
      Thread t4=new Thread(Gnight);
      t1.start();  t2.start();  t3.start();  t4.start();
   }
}