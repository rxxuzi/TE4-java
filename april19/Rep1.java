package april19;

public class Rep1 {
   public static void main(String[] args) {
      Rep2 r2 = new Rep2();
      r2.print();
      r2.setX(100);
      System.out.println("r2.x ->" + r2.getX());
      r2.z = -100;
      System.out.println("After");
      r2.print();
   }
}
