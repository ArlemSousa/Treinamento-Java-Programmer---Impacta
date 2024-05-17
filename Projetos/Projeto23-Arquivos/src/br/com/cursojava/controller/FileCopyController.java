package br.com.cursojava.controller;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Classe controladora da janela FileCopy.fxml utilizada para copiar arquivos de um diretorio para outro.
 * @author Sandro
 * @version 1.0, 06/10/2016 - Sandro - Implementacao.
 */
public class FileCopyController extends Application {

    @FXML
    private TextField txtOrigem;

    @FXML
    private TextField txtDestino;

    @FXML
    private Label lblMensagem;

    /** Caixa de dialogo para escolha de arquivo. */
    private FileChooser dialog = new FileChooser();

    /**
     * Janela da aplicacao.
     * Atraves desta variavel, podemos controlar o comportamento da janela, como fechar, mudar o titulo, etc.
     * Esta variavel esta sendo preenchida logo apos carregarmos o arquivo FXML (veja o metodo start())
     */
    private Stage stage;

    /**
     * Executado ao clicar no botao do arquivo de origem.
     */
    @FXML
    void origemOnAction(ActionEvent event) {

        /* Exibe a caixa de dialogo para escolha de arquivo e captura o arquivo selecionado. */
        File file = dialog.showOpenDialog(stage);

        /* Se o usuario selecionou um arquivo, coloca o seu nome absoluto na caixa de texto. */
        if (file != null) {
            txtOrigem.setText(file.getAbsolutePath());
        }
    }

    /**
     * Executado ao clicar no botao do arquivo de destino.
     */
    @FXML
    void destinoOnAction(ActionEvent event) {

        /* Exibe a caixa de dialogo para escolha de arquivo e captura o arquivo selecionado. */
        File file = dialog.showSaveDialog(stage);

        /* Se o usuario selecionou um arquivo, coloca o seu nome absoluto na caixa de texto. */
        if (file != null) {
            txtDestino.setText(file.getAbsolutePath());
        }
    }

    /**
     * Executado ao clicar no botao OK.
     */
    @FXML
    void okOnAction(ActionEvent event) {

      InputStream entrada = null;
      OutputStream saida = null;
      
      try {
        entrada = new FileInputStream(
            txtOrigem.getText());
        
        saida = new FileOutputStream(
            txtDestino.getText());
        
        byte[] buffer = new byte[4096];
        int quant;
        
        while ((quant = entrada.read(buffer)) > -1) {
          saida.write(buffer, 0, quant);
        }
        
        lblMensagem.setText(
            "Arquivo copiado com sucesso.");
        
      } catch (IOException e) {
        lblMensagem.setText(
            "Falha ao copiar o arquivo especificado");
        e.printStackTrace();
      } finally {
        close(entrada);
        close(saida);
      }
    }

    /**
     * Executado ao clicar no botao Cancelar.
     */
    @FXML
    void cancelarOnAction(ActionEvent event) {
        /* Fecha a janela */
        stage.close();
    }

    /**
     * Permite que o stage (janela) seja assinalada nesta classe controladora.
     */
    private void setStage(Stage stage) {
        this.stage = stage;
    }

    /**
     * Inicia a aplicacao carregando a primeira (e unica) janela.
     * Geralmente este metodo (bem como o metodo main) eh especificado em uma outra classe.
     * Colocamos aqui, para reduzir a quantidade de classes.
     */
    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resource/FileCopy.fxml"));
        Parent parent = loader.load();

        /* Assinala o stage (janela) na classe controladora */
        FileCopyController controller = loader.getController();
        controller.setStage(stage);

        stage.setScene(new Scene(parent));
        stage.setTitle("Copiar arquivo");
        stage.setResizable(false);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/resource/image/copy-icon.png")));
        stage.show();
    }

    /**
     * Metodo main, onde tudo comeca.
     * Aqui estamos fazendo a inicializacao padrao para aplicacoes Java FX.
     * Ao executar o launch(), o Java salta para o metodo start (acima) 
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void close(Closeable s) {
      try {
        s.close();
      } catch (Exception ex) {}
    }
}
