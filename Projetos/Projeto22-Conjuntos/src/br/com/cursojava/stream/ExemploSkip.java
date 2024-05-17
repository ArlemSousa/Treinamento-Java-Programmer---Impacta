package br.com.cursojava.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

import br.com.cursojava.model.Produto;

public class ExemploSkip {

  public static void main(String[] args) {

    Collection<Produto> colec = new ArrayList<>();

    colec.add(new Produto(2651, "Sabão em pó"));
    colec.add(new Produto(1523, "Achocolatado"));
    colec.add(new Produto(8320, "Cerveja em lata"));
    colec.add(new Produto(3211, "Molho de tomate"));
    colec.add(new Produto( 134, "Batata"));
    colec.add(new Produto(5986, "Papel higiênico"));
    colec.add(new Produto(3274, "Feijão Carioquinha"));
    colec.add(new Produto(6241, "Queijo Prato"));
    colec.add(new Produto( 235, "Carne moída"));
    colec.add(new Produto( 720, "Sabonete"));

    Stream<Produto> streamColec = colec.stream();

    streamColec
      .skip(2)
      .forEach(p -> System.out.println(p.getNome()));
    
    System.out.println();
    
    colec.forEach(p -> System.out.println(p.getNome()));
  }
}
