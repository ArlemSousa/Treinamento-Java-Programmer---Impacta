package br.com.cursojava.exemplo;

import java.util.List;
import java.util.Vector;

import br.com.cursojava.model.Cliente;

public class ExemploList {

  public static void main(String[] args) {

    List<Cliente> lista = new Vector<>();
    
    lista.add(new Cliente("João", "Rua X, 35",
        "96543-2763"));
    lista.add(new Cliente("Manuel", "Av. Lagos, 1304",
        "94231-7548"));
    lista.add(new Cliente("Joaquim", "Rua Borges, S/N",
        "12345-5678"));
    lista.add(1, new Cliente("Maria", "Estrada B, 345",
        "56483-5476"));

    lista.remove(3);
    
    for (Cliente c : lista) {
      System.out.println(c.getNome());
    }

    System.out.println("Total de clientes: " +
        lista.size());
  }
}
