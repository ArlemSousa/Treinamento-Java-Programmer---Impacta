package br.com.cursojava.generics;

import java.util.Arrays;

public class Teste {

  public static void main(String[] args) {
    
    Produto[] array = {
        new Produto("Pão", 2.35),
        new Produto("Leite", 2.34),
        new Produto("Alface", 8.9),
        new Produto("Mangeiga", 3.7)
    };
    
    Arrays.sort(array);
    
    for (Produto p : array) {
      System.out.println(p);
    }
  }
}

class Produto implements Comparable<Produto> {

  private String nome;
  private double preco;

  Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int compareTo(Produto outro) {
//    return this.nome.compareTo(outro.nome);
    return (int) Math.signum(this.preco - outro.preco);
  }

  public String toString() {
    return String.format("%s (%,.2f)", nome, preco);
  }
}
