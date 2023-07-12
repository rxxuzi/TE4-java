package aaa;

import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
   public static void main(String[] args) throws InterruptedException, ExecutionException {
      ExecutorService executor = Executors.newSingleThreadExecutor();
      Future<String> future = executor.submit(new Callable<String>() {
         @Override
         public String call() throws Exception {
            for (int i = 0; i < 5; i++) {
               Thread.sleep(500);
               System.out.println("Thread側：" + (i + 1) + "回目の実行です");
            }
            return "Thread側の処理は終了しました";
         }
      });
      while (!future.isDone()) {
         System.out.println("メインスレッド：まだ終了していません");
         Thread.sleep(500);
      }
      System.out.println(future.get());
      executor.shutdown();
   }
}


