package br.com.cursojava.projetofinal.ui;

import java.util.List;

import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.vo.Cargo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;

public class PesquisaCargoController {

    @FXML
    private TextField txtCargo;

    @FXML
    private TableView<Cargo> tabCargo;

    @FXML
    private TableColumn<Cargo, Boolean> colIndice;

    @FXML
    private TableColumn<Cargo, Integer> colId;

    @FXML
    private TableColumn<Cargo, String> colNome;

    @FXML
    private Label lblMensagem;

    public void initialize() {
    	colId.setCellValueFactory(new PropertyValueFactory<>("id"));
    	colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
    	colIndice.setCellFactory(x -> {
    		CheckBoxTableCell<Cargo, Boolean> cell = new CheckBoxTableCell<>();
    		cell.setSelectedStateCallback(y -> null);
    		return cell;
    	});
    }
    
    @FXML
    void procurarOnAction(ActionEvent event) {
    	
    	try {

    		CargoDAO dao = new CargoDAO();
			List<Cargo> lista = dao.findByName(txtCargo.getText());

			tabCargo.getItems().clear();
			tabCargo.getItems().addAll(lista);

    	} catch (DAOException e) {
    		lblMensagem.setText(e.getMessage());
			e.printStackTrace();
		}
    }
}
