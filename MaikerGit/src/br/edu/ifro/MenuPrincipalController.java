/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 *
 * @author 76220842200
 */
public class MenuPrincipalController implements Initializable {
    @FXML
    private JFXTextField txtNum1,txtNum2,txtResultado;
    @FXML
    private JFXButton btnSoma;
    @FXML
    private MenuItem menuCadastroAluno;
    @FXML
    private MenuItem menuCadastroSair;
    @FXML
    private void soma(ActionEvent event){
        txtResultado.setText(""+(Integer.parseInt(txtNum1.getText())+Integer.parseInt(txtNum2.getText())));
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {}    
    @FXML
    private void abrirCadastroAluno(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),900,682);
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Aluno");
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){}
    }
    @FXML
    private void fecharPrograma(ActionEvent event) {
        System.exit(0);
    }
}