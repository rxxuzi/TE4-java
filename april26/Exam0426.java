package april26;

import java.util.Scanner;

public class Exam0426 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Product Count : ");
      Price.product_count = sc.nextInt();

      Price p = new Price(); //インスタンス化

      System.out.println("Product Count " + Price.product_count);//static による参照

      p.print(); //Bihin class のprintメソッド

      System.out.println("Total Bihin : $" + p.total_price); //インスタンス
   }
}
