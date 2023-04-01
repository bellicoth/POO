package br.edu.senacsp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField numero;

    @FXML
    private Button btnVerificar;

    @FXML
    private Label lblResultado;

    public void verificarNumero(){

        double valor = Double.valueOf(numero.getText());
        if(valor % 2 == 0){

            lblResultado.setText("Resultado: PAR");
        }else{

            lblResultado.setText("Resultado: IMPAR");
        }
    }
}
