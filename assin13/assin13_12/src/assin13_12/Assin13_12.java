package assin13_12;
class NotTriangleException extends Exception{
}
class EquilateralTriangle extends Exception{ 
}
class NotEquilateralTriangle extends Exception{
}

public class Assin13_12{
   public static void main(String args[])
   {
      int a=5; int b=5; int c=5;
      try{
         System.out.println("a=" + a + ", b=" + b + ", c=" + c);
         tri(a, b, c);
      }
      catch(NotTriangleException e){
         System.out.println("不構成三角形");
      }
      catch(EquilateralTriangle e){
         System.out.println("這是正三角形");
      }
      catch(NotEquilateralTriangle e){
         System.out.println("這不是正三角形");
      }
   }
   public static void tri(int a,int b,int c) throws
       NotTriangleException,EquilateralTriangle,NotEquilateralTriangle{
      if((a+b)<c || (a+c)<b || (b+c)<a) {
         throw new NotTriangleException();
      }
      else if(a==b && a==c && b==c) {
         throw new EquilateralTriangle();
      }
      else {
         throw new NotEquilateralTriangle();
      }
   }
}