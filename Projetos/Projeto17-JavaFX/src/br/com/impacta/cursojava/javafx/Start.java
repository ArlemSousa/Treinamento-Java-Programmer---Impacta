package br.com.impacta.cursojava.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage stage) throws Exception {
    
    FXMLLoader loader = new FXMLLoader(
        getClass().getResource(
        "/resources/Rascunho.fxml"));
    
    Parent parent = loader.load();
    Scene scene = new Scene(parent);
    
    stage.setScene(scene);
    stage.setTitle("Cadastro Teste");
    stage.show();
  }
}
