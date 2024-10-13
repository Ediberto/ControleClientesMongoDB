package threads;

public class Threads {
    public static void main(String[] args) { 
      Runnable r1 = new Mostra(); 
      Runnable r2 = new Mostra();
      Runnable r3 = new Mostra();
      new Thread(r1).start();
      new Thread(r2).start();
      new Thread(r3).start();
   } 
} 