package july19;

class Foo implements Version{
   @Override
   public String getVersion() {
      return "v1.0";
   }
}

class Bar implements Version{
   @Override
   public String getVersion() {
      return "v2.0";
   }
}

public class GX{
   public static void main(String[] args) {
      Foo f = new Foo();
      Bar b = new Bar();
      System.out.println(f.getVersion());
      System.out.println(b.getVersion());
   }
}