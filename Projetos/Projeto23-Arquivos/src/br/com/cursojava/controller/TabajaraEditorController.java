package br.com.cursojava.controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * Classe controladora da janela TabajaraEditor.fxml utilizada como aplicativo editor de textos.
 * @author sandro.vieira
 * @version 1.0, 13 de out de 2016 - sandro.vieira - Implementacao.
 */
public class TabajaraEditorController extends Application {

    /** Text area que contem todo o texto que esta sendo editado. */
    @FXML
    private TextArea txtEditor;

    /** Label utilizado para exibir mensagens de erro ou sucesso. */
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
     * Executado ao clicar no menu Abrir.
     * @param event
     */
    @FXML
    void abrirOnAction(ActionEvent event) {
        // TODO IMPLEMENT ME!
    }

    /**
     * Executado ao clicar no menu Novo.
     * @param event
     */
    @FXML
    void novoOnAction(ActionEvent event) {
        // TODO IMPLEMENT ME!
    }

    /**
     * Executado ao clicar no menu Sair.
     * @param event
     */
    @FXML
    void sairOnAction(ActionEvent event) {
        // TODO IMPLEMENT ME!
    }

    /**
     * Executado ao clicar no menu Salvar.
     * @param event
     */
    @FXML
    void salvarOnAction(ActionEvent event) {
        // TODO IMPLEMENT ME!
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

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resource/TabajaraEditor.fxml"));
        Parent parent = loader.load();

        /* Assinala o stage (janela) na classe controladora */
        TabajaraEditorController controller = loader.getController();
        controller.setStage(stage);

        stage.setScene(new Scene(parent));
        stage.setTitle("Tabajara Editor");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/resource/image/editor-icon.png")));
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
}
