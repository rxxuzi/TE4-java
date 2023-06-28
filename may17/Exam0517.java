package may17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam0517 {
   public static void main(String[] args) {

      List <Bihin> p = new ArrayList<>();

      p.add( new Bihin("PC" , DateTimeFormatter.ofPattern("yyyy/MM/dd")
               .parse("2013/03/10", LocalDate::from) , 105_000 , 5));
      p.add( new Bihin("Scanner" , DateTimeFormatter.ofPattern("yyyy/MM/dd")
              .parse("2010/07/21", LocalDate::from) , 62_500 , 1));
      p.add( new Bihin("Bookshelf" , DateTimeFormatter.ofPattern("yyyy/MM/dd")
              .parse("2015/10/01", LocalDate::from) , 138_800 , 2));


      System.out.println("==============Q.1 & 2=============");

      for(Bihin bihin : p) {
         System.out.println(bihin.toString());
      }

      System.out.println("==============Q.3=============");

      p.get(0).setDate(DateTimeFormatter.ofPattern("yyyy/MM/dd").parse("2013/04/01", LocalDate::from));


      for(Bihin bihin : p) {
         System.out.println(bihin.toString());
      }

      System.out.println("==============Q.4=============");
      boolean b = p.get(0).date.isAfter(p.get(1).date);
      System.out.println(b);

   }
}
