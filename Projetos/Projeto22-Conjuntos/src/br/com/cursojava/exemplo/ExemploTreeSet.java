package br.com.cursojava.exemplo;

import java.util.SortedSet;
import java.util.TreeSet;

public class ExemploTreeSet {

  public static void main(String[] args) {
    
    SortedSet<String> conjunto = new TreeSet<>();
    
    conjunto.add("Nigéria");
    conjunto.add("Brasil");
    conjunto.add("Argentina");
    conjunto.add("Zimbabue");
    conjunto.add("Dinamarca");
    conjunto.add("Cuba");

    conjunto.forEach(s -> System.out.println(s));
  }
}
