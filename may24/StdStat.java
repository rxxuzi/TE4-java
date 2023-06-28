package may24;

public class StdStat {
   String name;
   Csv csv;
   public StdStat(Csv csv){
      this.csv = csv;
   }

   @Override
   public String toString() {
      return csv.toString();
   }
}
