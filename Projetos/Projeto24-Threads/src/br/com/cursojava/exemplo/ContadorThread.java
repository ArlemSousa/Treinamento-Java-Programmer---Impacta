package br.com.cursojava.exemplo;

public class ContadorThread extends Thread {

  public void run() {
    
    for (int i = 0; i < 300; i++) {
      System.out.println(
          "Estou na thread " +
          Thread.currentThread().getName());
      try {Thread.sleep(5);} catch (Exception e) {};
    }
  }
}
