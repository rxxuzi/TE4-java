package may24;

public class Csv2 {
   private String str;
   private final String[] data;
   public double english;
   public double japanese;
   public double math;
   public double average;
   public Csv2(String str) {
      this.data = str.split(",");
      this.english = Double.parseDouble(data[1]);
      this.japanese = Double.parseDouble(data[2]);
      this.math = Double.parseDouble(data[3]);
      this.average = (english + japanese + math) / 3;
   }

   public String getName() {
      return data[0];
   }

}
