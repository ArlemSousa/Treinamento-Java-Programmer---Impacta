package br.com.cursojava.exemplo;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import br.com.cursojava.model.Cliente;

public class ExemploTreeSet2 {

  public static void main(String[] args) {

    SortedSet<Cliente> set = new TreeSet<>(
        Comparator.comparing(c -> c.getEndereco()));

    set.add(new Cliente("João", "Rua X, 35",
        "96543-2763"));
    set.add(new Cliente("Manuel", "Av. Lagos, 1304",
        "94231-7548"));
    set.add(new Cliente("Joaquim", "Rua Borges, S/N",
        "12345-5678"));
    set.add(new Cliente("Maria", "Estrada B, 345",
        "56483-5476"));
    
    set.forEach(c -> System.out.println(
        c.getNome() + " - " + c.getEndereco()));
  }
}
