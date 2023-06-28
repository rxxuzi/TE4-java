package may31;
import java.time.*;
public class ExecStudentMember {
   public static void main(String[] args) {

      var stmem = new StudentMember(100,"田中角栄", LocalDate.of(2004,7,30));
      System.out.println(stmem.getId());
      System.out.println(stmem.getName());
      System.out.println(stmem.getBirthday());
   }
}
