package april26;

import java.util.ArrayList;

public class Rep1 {
   private static final ArrayList<Rep2> list = new ArrayList<>();
   public static void main(String[] args) {
      for(var i = 0; i < 10; i++) {
         list.add(new Rep2(i));
      }
      System.out.println("Size:" + list.size());
      for(Rep2 r : list) {
         r.print();
      }
   }
}
