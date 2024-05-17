package br.com.cursojava.projetofinal.ui;

import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.vo.CargoVO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroCargoController {

    @FXML
    private TextField txtCargo;

    @FXML
    private Label lblMensagem;

    @FXML
    void salvarOnAction(ActionEvent event) {
      
      try {

        /* Preenche o VO */
        CargoVO cargo = new CargoVO();
        cargo.setNome(txtCargo.getText());
        
        /* Grava na base de dados */
        CargoDAO dao = new CargoDAO();
        dao.save(cargo);
        
        lblMensagem.setText("Cargo salvo com sucesso.");
        txtCargo.setText("");
        txtCargo.requestFocus();

      } catch (DAOException e) {
        lblMensagem.setText(e.getMessage());
        e.printStackTrace();
      }
    }

    @FXML
    void limparOnAction(ActionEvent event) {
      txtCargo.setText("");
      lblMensagem.setText("");
      txtCargo.requestFocus();
    }
}
