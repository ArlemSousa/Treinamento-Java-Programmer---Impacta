package br.com.impacta.cursojava.controller;

import java.util.Collection;

import br.com.cursojava.model.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class Teste {

  public static void main() {

    ListView<Produto> list = new ListView<>();
    
    Collection<Produto> minhaCollection = null;
    
    ObservableList<Produto> items =
        FXCollections.observableArrayList(
            minhaCollection);
    list.setItems(items);
    
    
    
    list.getItems().clear();
    
    for (;;) {
      list.getItems().add(new Produto());
    }
  }
}
