package br.com.cursojava.projetofinal.ui;

import java.util.List;

import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.dao.FuncionarioDAO;
import br.com.cursojava.projetofinal.vo.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PesquisaFuncionarioController {

    @FXML
    private TextField txtNome;

    @FXML
    private TableView<Funcionario> tabFuncionario;

    @FXML
    private TableColumn<Funcionario, Integer> colMatricula;

    @FXML
    private TableColumn<Funcionario, String> colNome;

    @FXML
    private TableColumn<Funcionario, String> colCargo;

    @FXML
    private TableColumn<Funcionario, String> colSalario;

    @FXML
    private Label lblMensagem;

    public void initialize() {
    	colMatricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
    	colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
    	colCargo.setCellValueFactory(new PropertyValueFactory<>("cargoNome"));
    	colSalario.setCellValueFactory(new PropertyValueFactory<>("salarioFormatado"));
    }
    
    @FXML
    void procurarOnAction(ActionEvent event) {

    	try {
			FuncionarioDAO dao = new FuncionarioDAO();
			List<Funcionario> lista = dao.findByName(txtNome.getText());
			
			tabFuncionario.getItems().clear();
			tabFuncionario.getItems().addAll(lista);
		} catch (DAOException e) {
			lblMensagem.setText(e.getMessage());
			e.printStackTrace();
		}
    }
}
