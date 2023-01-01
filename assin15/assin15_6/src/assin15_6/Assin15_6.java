package assin15_6;

class Add implements Runnable
{
   private int n1;
   private int sum = 0;
   public Add(int a){
      n1 = a;
   }
   public void run(){
      for(int i=1; i<=n1; i++){
         for(int j=0; j<100000000; j++);
         sum += i;
      }
      System.out.println("1+2+...+" + n1 + "=" + sum);
   }
}

public class Assin15_6{
   public static void main(String[] args){
      Add a1 = new Add(5);  Add a2 = new Add(10);
      Thread t1=new Thread(a1);  Thread t2=new Thread(a2);
      t1.start();  t2.start();
   }
}