package threads;

class Mostra implements Runnable { 
   private int i; 
   private static int cont = 0; 
   private int identificacao; 
   public void run() { 
      while(true) 
        System.out.println("Numero (" + identificacao + "): " + i++);
   } 
   public Mostra() { 
        cont++; 
        identificacao = cont; 
   } 
}