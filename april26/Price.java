package april26;

import java.util.ArrayList;
import java.util.Random;

public class Price {
   Random rand = new Random();
   private static final ArrayList<String> product_name = new ArrayList<>();
   private static final ArrayList<Integer> product_price = new ArrayList<>();

   public static int product_count = 10;
   public int total_price = 0;

   public Price(){
      for(int i = 0 ; i < product_count; i++){
         product_name.add("product " + i);
         product_price.add(rand.nextInt(100)  + rand.nextInt(10) * 100);
      }

      for (Integer pp : product_price) {
         total_price += pp;
      }

   }

   public void print(){
      System.out.println("Number of products : " + product_count);
      for (int i = 0 ; i < product_count  ; i++){
         System.out.println(product_name.get(i) + ": $" + product_price.get(i));
      }
   }
}
