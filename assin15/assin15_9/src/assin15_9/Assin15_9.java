package assin15_9;

class CTest extends Thread implements Runnable{
   private String id;
   private int sec;
   public CTest(String str, int s){
      id = str;  sec = s;
   }
   public void run(){
      for(int i=0; i<10; i++){
         try{
            sleep(sec);
         }
         catch(InterruptedException e){
         }
         System.out.println(id+" is running..");
      }
   }
}


public class Assin15_9{
   public static void main(String[] args){
      CTest C1 = new CTest("Thread 1", 1000);
      CTest C2 = new CTest("Thread 2", 2500);
      Thread T1=new Thread(C1);
      Thread T2=new Thread(C2);
      T1.start();  T2.start();
   }
}