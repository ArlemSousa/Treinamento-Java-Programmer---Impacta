package br.com.cursojava.projetofinal.ui;

import java.text.ParseException;
import java.util.List;

import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.dao.FuncionarioDAO;
import br.com.cursojava.projetofinal.vo.Cargo;
import br.com.cursojava.projetofinal.vo.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroFuncionarioController {
	
    @FXML
    private TextField txtNome;

    @FXML
    private ComboBox<Cargo> cmbCargo;

    @FXML
    private TextField txtSalario;

    @FXML
    private Label lblMensagem;

    public void initialize() {

    	try {
			CargoDAO cargoDao = new CargoDAO();
			List<Cargo> cargoLista = cargoDao.findAll();
			cmbCargo.getItems().addAll(cargoLista);
		} catch (DAOException e) {
			lblMensagem.setText(e.getMessage());
			e.printStackTrace();
		}

    	txtSalario.focusedProperty().addListener(x -> {
    		if (!txtSalario.isFocused()) {
		    	try {
					double salario = Funcionario.MASCARA_SALARIO.parse(txtSalario.getText()).doubleValue();
					txtSalario.setText(Funcionario.MASCARA_SALARIO.format(salario));
				} catch (ParseException e) {
					txtSalario.setText("");
				}
    		}
		});
    }
    
    @FXML
    void limparOnAction(ActionEvent event) {
    	txtNome.setText("");
    	cmbCargo.getSelectionModel().select(-1);
    	txtSalario.setText("");
    	lblMensagem.setText("");
    }

    @FXML
    void salvarOnAction(ActionEvent event) {
    	
    	if (txtNome.getText().trim().equals("")) {
    		lblMensagem.setText("Digite o nome do funcionário");
    		txtNome.requestFocus();
    		return;
    	}
    	
    	if (cmbCargo.getSelectionModel().getSelectedIndex() < 0) {
    		lblMensagem.setText("Selecione um cargo");
    		cmbCargo.requestFocus();
    		return;
    	}

		double salario;

		try {
			salario = Funcionario.MASCARA_SALARIO.parse(txtSalario.getText()).doubleValue();
		} catch (ParseException e) {
			lblMensagem.setText("Salario invalido");
			txtSalario.selectAll();
			txtSalario.requestFocus();
			return;
		}
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(txtNome.getText().trim());
		funcionario.setCargoId(cmbCargo.getValue().getId());
		funcionario.setSalario(salario);
		
		try {

			FuncionarioDAO dao = new FuncionarioDAO();
			dao.save(funcionario);

			limparOnAction(null);
			lblMensagem.setText("Dados registrados com sucesso.");
			
		} catch (DAOException e) {
			lblMensagem.setText(e.getMessage());
			e.printStackTrace();
		}
    }
}
