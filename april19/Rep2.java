package april19;

public class Rep2 {
   private int x = 10;
   private int y = 20;
   public int z = 20;

   public void print(){
      System.out.println("x ->" + this.x);
      System.out.println("y ->" + this.y);
      System.out.println("z ->" + this.z);
   }
   public void setX(int x){
      //if x is less than 0, set x to 0
      this.x = Math.max(x, 0);
   }
   public int getX(){
      return this.x;
   }
}
