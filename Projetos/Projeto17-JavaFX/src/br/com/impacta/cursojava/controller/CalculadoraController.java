package br.com.impacta.cursojava.controller;

import java.util.function.BiFunction;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculadoraController {

    @FXML
    private TextField txtValor1;

    @FXML
    private TextField txtValor2;

    @FXML
    private TextField txtResultado;

    @FXML
    void somarOnAction(ActionEvent event) {
      realizaOperacao((x, y) -> x + y);
    }

    @FXML
    void subtrairOnAction(ActionEvent event) {
      realizaOperacao((x, y) -> x - y);
    }

    @FXML
    void multiplicarOnAction(ActionEvent event) {
      realizaOperacao((x, y) -> x * y);
    }

    @FXML
    void dividirOnAction(ActionEvent event) {
      realizaOperacao((x, y) -> x / y);
    }
    
    void realizaOperacao(BiFunction<Double, Double, Double> funcao) {

      try {

        double valor1 = Double.parseDouble(
            txtValor1.getText());
        double valor2 = Double.parseDouble(
            txtValor2.getText());

        double result = funcao.apply(valor1, valor2);
        txtResultado.setText(Double.toString(result));

      } catch (NumberFormatException e) {
        txtResultado.setText("Dados inválidos");
      }
    }
}
