package br.com.impacta.cursojava.controller;

import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroController {

    @FXML
    private TextField txtCurso;

    @FXML
    private TextField txtAluno;

    @FXML
    private Label lblMensagem;

    @FXML
    void initialize() {
      
      String mensagem = new Date().toString();
      
      lblMensagem.setText(mensagem);
    }

    @FXML
    void okOnAction(ActionEvent event) {
      String mensagem =
          "Olá, " + txtAluno.getText() +
          " do curso de " + txtCurso.getText();
      
      lblMensagem.setText(mensagem);
    }

    @FXML
    void cancelarOnAction(ActionEvent event) {
      lblMensagem.setText("");
    }
}
