package br.com.cursojava.projetofinal.ui;

import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.vo.Cargo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroCargoController {

	@FXML
	private TextField txtNome;

	@FXML
	private Label lblMensagem;

	@FXML
	void limparOnAction(ActionEvent event) {
		txtNome.setText("");
		lblMensagem.setText("");
	}

	@FXML
	void salvarOnAction(ActionEvent event) {

		try {

			Cargo cargo = new Cargo();
			cargo.setNome(txtNome.getText());

			CargoDAO dao = new CargoDAO();
			dao.save(cargo);

			lblMensagem.setText("Dados registrados com sucesso.");
			txtNome.setText("");
			txtNome.requestFocus();

		} catch (DAOException e) {
			e.printStackTrace();
			lblMensagem.setText(e.getMessage());
		}
	}
}
