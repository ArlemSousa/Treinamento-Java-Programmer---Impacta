package br.com.cursojava.projetofinal.ui;

import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.dao.GenericDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class NumeroExtensoController {

    @FXML
    private TextField txtNumero;

    @FXML
    private TextArea txtExtenso;

    @FXML
    private Label lblMensagem;

    @FXML
    void numeroOnKeyReleased(KeyEvent event) {

    	try {

    		int numero = Integer.parseInt(txtNumero.getText());

    		GenericDAO dao = new GenericDAO();
    		String result = dao.executeExtenso(numero);
    		
    		txtExtenso.setText(result);
    		lblMensagem.setText("");

    	} catch (NumberFormatException e) {
    		lblMensagem.setText("Numero invalido");
		} catch (DAOException e) {
			lblMensagem.setText(e.getMessage());
			e.printStackTrace();
		}
    }
}
