package july19;

public class ThreadTest extends Thread {
   public final static int MAX = 10;
   public static void main(String[] args) {
      O o = new O();
      X x = new X();
      Thread t1 = new Thread(o);
      Thread t2 = new Thread(x);
      t1.start();
      t2.start();
   }
}

class O implements Runnable {
   @Override
   public void run() {
      for(int i = 0; i < ThreadTest.MAX; i++){
         System.out.println("O");
      }
   }
}

class X implements Runnable{
   @Override
   public void run() {
      for(int i = 0; i < ThreadTest.MAX; i++){
         System.out.println("X");
      }
   }
}