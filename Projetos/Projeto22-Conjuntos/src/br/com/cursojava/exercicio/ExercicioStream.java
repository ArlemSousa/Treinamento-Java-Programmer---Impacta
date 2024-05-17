package br.com.cursojava.exercicio;

import java.util.ArrayList;
import java.util.stream.Stream;

import br.com.cursojava.model.Estudante;

public class ExercicioStream {

  public static void main(String[] args) {

    ArrayList<Estudante> estudanteList =
        new ArrayList<>();

    estudanteList.add(new Estudante("Joana", 8.5, 8.5));
    estudanteList.add(new Estudante("Antônio", 6, 9));
    estudanteList.add(new Estudante("Mariana", 7.5, 5));
    estudanteList.add(new Estudante("Manuel", 7.5, 6.9));
    estudanteList.add(new Estudante("Ricardo", 7, 6));
    estudanteList.add(new Estudante("Gustavo", 9.5, 10));
    
    estudanteList.forEach(e -> e.setMedia(
      (e.getNotaMatematica() + e.getNotaPortugues()) / 2
    ));
    
    Stream<Estudante> estudanteStream = estudanteList
        .stream();
    
    estudanteStream
      .filter(e -> e.getMedia() >= 7)
      .forEach(e -> System.out.println(
          e.getNome() + ": " + e.getMedia()));
  }
}
