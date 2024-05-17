package br.com.cursojava.exemplo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import br.com.cursojava.model.Produto;

public class ExemploCollection {

  public static void main(String[] args) {

    Collection<Produto> colecao = new HashSet<>();
    
    colecao.add(new Produto(1012, "Cerveja em lata"));
    colecao.add(new Produto(1025, "Picanha"));
    colecao.add(new Produto(1037, "Carvão"));
    colecao.add(new Produto(1145, "Limão"));
    colecao.add(new Produto(1210, "Açúcar"));
    colecao.add(new Produto(1345, "Pinga"));

//    Iterator<Produto> it = colecao.iterator();
//    
//    while (it.hasNext()) {
//      Produto p = it.next();
//      System.out.println(p.getNome());
//    }

//    for (Produto p : colecao) {
//      System.out.println(p.getNome());
//    }

    colecao.forEach(
        p -> System.out.println(p.getNome()));

    System.out.println();
    System.out.println("Total de itens: " +
        colecao.size());
  }
}
