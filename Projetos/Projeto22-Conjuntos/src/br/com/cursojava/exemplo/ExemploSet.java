package br.com.cursojava.exemplo;

import java.util.HashSet;
import java.util.Set;

import br.com.cursojava.model.Cliente;

public class ExemploSet {

  public static void main(String[] args) {
    
    Set<Cliente> conjunto = new HashSet<>();
    
    conjunto.add(new Cliente("João", "Rua X, 35",
        "96543-2763"));
    conjunto.add(new Cliente("Manuel",
        "Av. Lagos, 1304", "94231-7548"));
    conjunto.add(new Cliente("Joaquim",
        "Rua Borges, S/N", "12345-5678"));
    conjunto.add(new Cliente("João", "Estrada B, 345",
        "56483-5476"));

    for (Cliente c : conjunto) {
        System.out.println(c.getNome() + " - " +
          c.getEndereco());
    }
  }
}
