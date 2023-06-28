package may24;

public class Exam0524 {
   public static void main(String[] args) {
      var csv = new Csv("100,200,300");
      String name = csv.get(1);
      System.out.println(name);

      String[] names = {"100","200","300"};
      for (String s : names) {
         System.out.println(s);
      }
   }
}
