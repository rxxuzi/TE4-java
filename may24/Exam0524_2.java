package may24;

public class Exam0524_2 {
   public static void main(String[] args) {
      Csv2[] csv = new Csv2[5];

      csv[0] = new Csv2("田中,80,65,85");
      csv[1] = new Csv2("前田,90,80,95");
      csv[2] = new Csv2("中村,70,90,75");
      csv[3] = new Csv2("木村,60,70,65");
      csv[4] = new Csv2("鈴木,85,65,70");

      for (Csv2 c : csv) {
         System.out.printf("名前: %s , 英語:%3f 国語:%3f 数学:%3f 平均:%3f\n",c.getName(),c.english,c.japanese,c.math,c.average);
      }

   }
}
