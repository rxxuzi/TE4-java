package may24;

public class Csv {
   private String str;
   private String[] data;
   public Csv(String str) {
      this.data = str.split(",");
   }
   public Csv(String str,boolean b){
      this.data = str.split(",");
   }


   public String get(int n){
      return data[n];
   }

   public int size(){
      return data.length;
   }
}
