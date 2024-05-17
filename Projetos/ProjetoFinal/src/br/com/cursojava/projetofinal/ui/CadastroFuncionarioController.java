package br.com.cursojava.projetofinal.ui;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;

import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.dao.FuncionarioDAO;
import br.com.cursojava.projetofinal.vo.CargoVO;
import br.com.cursojava.projetofinal.vo.FuncionarioVO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroFuncionarioController {

  private static final DecimalFormat MASCARA_SAL = new DecimalFormat(
      "#,##0.00");

  @FXML
  private ComboBox<CargoVO> cmbCargo;

  @FXML
  private TextField txtNome;

  @FXML
  private TextField txtSalario;

  @FXML
  private Label lblMensagem;

  public void initialize() {

    try {

      /* Obtem a lista de cargos */
      CargoDAO dao = new CargoDAO();
      List<CargoVO> lista = dao.findAll();

      /* Adiciona o cargo "fake" */
      CargoVO fake = new CargoVO();
      fake.setId(0);
      fake.setNome("[SELECIONE UM CARGO]");
      cmbCargo.getItems().add(fake);

      /* Adiciona os cargos ao combo */
      cmbCargo.getItems().addAll(lista);

      /* Seleciona o fake */
      cmbCargo.getSelectionModel().select(0);

    } catch (DAOException e) {
      lblMensagem.setText(e.getMessage());
      e.printStackTrace();
    }
  }

  @FXML
  void salvarOnAction(ActionEvent event) {

    lblMensagem.setText("");

    /* Cria um VO vazio */
    FuncionarioVO funcionario = new FuncionarioVO();

    if (txtNome.getText().trim().length() == 0) {
      lblMensagem.setText("Nome é obrigatório");
      return;
    }

    if (txtNome.getText().length() > 30) {
      lblMensagem
          .setText("O nome não pode ter mais de 30 caracteres");
      return;
    }

    /* Preenche o nome */
    funcionario.setNome(txtNome.getText());

    CargoVO cargo = cmbCargo.getSelectionModel()
        .getSelectedItem();

    if (cargo == null || cargo.getId() == 0) {
      lblMensagem.setText("Selecione um cargo");
      return;
    }

    /* Preenche o id do cargo */
    funcionario.setCargoId(cargo.getId());

    try {

      /* Valida e preenche o salario */
      double salario = MASCARA_SAL.parse(txtSalario
          .getText()).doubleValue();
      funcionario.setSalario(salario);

      /* Grava no banco de dados */
      FuncionarioDAO dao = new FuncionarioDAO();
      dao.save(funcionario);

      /* Limpa e exibe mensagem de sucesso. */
      txtNome.setText("");
      cmbCargo.getSelectionModel().select(0);
      txtSalario.setText("");
      lblMensagem.setText(
        "Funcionário salvo com sucesso!");
      
    } catch (ParseException e) {
      lblMensagem.setText(
          "Digite o salario corretamente");
      return;
    } catch (DAOException e) {
      lblMensagem.setText(e.getMessage());
      e.printStackTrace();
    }
  }

  @FXML
  void limparOnAction(ActionEvent event) {
    txtNome.setText("");
    cmbCargo.getSelectionModel().select(0);
    txtSalario.setText("");
    lblMensagem.setText("");
  }
}
