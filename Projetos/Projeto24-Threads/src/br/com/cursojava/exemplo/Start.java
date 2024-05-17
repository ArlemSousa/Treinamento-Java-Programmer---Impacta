package br.com.cursojava.exemplo;

public class Start {

  public static void main(String[] args) {
    
    Thread t1 = new ContadorThread();
    Thread t2 = new ContadorThread();
    Thread t3 = new ContadorThread();
    Thread t4 = new ContadorThread();
    
    t1.setName("Primeira thread");
    t4.setPriority(2);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
