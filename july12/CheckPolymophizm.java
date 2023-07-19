package july12;

public class CheckPolymophizm {
   public static void main(String[] args) {
      Foo foo = new Foo();
      Bar bar = new Bar();
      Baz baz = new Baz();

      Foo bar2 = new Bar();
//      Bar bar3 = new Foo(); エラー

      System.out.println(foo.clac());
      System.out.println(bar.clac());
      System.out.println(baz.clac());
   }

}
class Foo {
   private double x = 10d;

   public double clac() {
      return x;
   }

   public double getX() {
      return x;
   }
}

class Bar extends Foo {
   @Override
   public double clac() {
      return getX() * 2;
   }
}

class Baz extends Foo {
   @Override
   public double clac() {
      return getX() / 2;
   }
}
