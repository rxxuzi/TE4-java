package july05;

public class InstanceOfTest {
   public static void main(String[] args) {
      Object a = new A();
      Object b = new B();
      Object c = new C();

      System.out.println("instanceof A");
      System.out.println(a instanceof A);
      System.out.println(b instanceof A);
      System.out.println(c instanceof A);

      System.out.println("instanceof B");
      System.out.println(a instanceof B);
      System.out.println(b instanceof B);
      System.out.println(c instanceof B);

      System.out.println("instanceof C");
      System.out.println(a instanceof C);
      System.out.println(b instanceof C);
      System.out.println(c instanceof C);

   }
}
class  A{
   public void display() {
      System.out.println("This is class A");
   }
}
class B extends A {
   public void display() {
      System.out.println("This is class B");
   }
}
class C extends B{
   @Override
   public void display() {
      System.out.println("This is class C");
   }
}