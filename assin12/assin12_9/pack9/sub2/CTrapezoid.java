package pack9.sub2;

public class CTrapezoid {
   private int upper;
   private int base;
   private int height;

   public CTrapezoid(int u, int b, int h) {
      upper = u;
      base = b;
      height = h;
   }

   public void show() {
      double area = (upper + base) * height / 2.0;
      System.out.print("upper=" + upper);
      System.out.print(", base=" + base);
      System.out.print(", height=" + height);
      System.out.println(", area=" + area);
   }
}