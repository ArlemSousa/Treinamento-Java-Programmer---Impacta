package br.com.cursojava.exercicio;

import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.controller.FuncionarioController;
import br.com.cursojava.model.Funcionario;
import javafx.application.Application;
import javafx.stage.Stage;

public class ExercicioList extends Application {

  public static void main(String[] args) {
    launch(args);
  }
  
  public void start(Stage arg0) throws Exception {

    List<Funcionario> listaEntrada = new ArrayList<>();
    
    Funcionario func =
        FuncionarioController.showInputFuncionario();
    
    while (func != null) {
      listaEntrada.add(func);
      func = FuncionarioController.showInputFuncionario();
    }

    System.out.println("Nome            Idade   Salário");
    System.out.println("=============== ===== =========");

    double totalSalarios = 0;
    double totalIdade = 0;

    for (Funcionario f : listaEntrada) {

      System.out.printf("%-15s %5d %,9.2f\n",
          f.getNome(), f.getIdade(), f.getSalario());

      totalSalarios += f.getSalario();
      totalIdade += f.getIdade();
    }

    totalIdade /= listaEntrada.size();
    
    System.out.println();
    System.out.println("Total de funcionários: " +
        listaEntrada.size());
    System.out.printf("Total de salários    : %,.2f\n",
        totalSalarios);
    System.out.printf("Média de idade       : %,.1f\n",
        totalIdade);
  }
}
