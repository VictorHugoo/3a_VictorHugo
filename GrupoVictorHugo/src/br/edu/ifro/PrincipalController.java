/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author 03194090232
 */
public class PrincipalController implements Initializable {
    
    @FXML
    Button btnSair;
    
    @FXML
    private Label label;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AbrirCadastroAluno(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 682);
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Alunos");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {

}
    }

    @FXML
    private void FecharProjeto(ActionEvent event) {
    }

    @FXML
    private void Soma(ActionEvent event) {
    }
    
}
