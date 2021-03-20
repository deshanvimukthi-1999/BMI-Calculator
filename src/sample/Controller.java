package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javax.swing.*;
import java.awt.*;

public class Controller {

    @FXML
    private TextField tf1;

    @FXML
    private TextField tf2;

    @FXML
    private Label lb1;

    @FXML
    private Label lb2;

    @FXML
    private Button btn;

    public void enterheight(){
        tf1.getText();
    }
    public void enterweight(){
        tf2.getText();
    }

    public void calculate() {
        if(tf2.getText().trim().isEmpty() || tf1.getText().trim().isEmpty()){
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setContentText("Please Enter Correct Height and Weight");
            a.setAlertType(Alert.AlertType.ERROR);
            a.show();

        }else {

            float a=Float.parseFloat(tf1.getText());
            float b=Float.parseFloat(tf2.getText());
            float bmi=b/(a*a);
            lb1.setText((""+bmi));

            if(bmi<=18.5){
                lb2.setText("UnderWeight");

            }else if(bmi <=24.9){
                lb2.setText("Normal Weight");

            }else if(bmi<29.9){
                lb2.setText("Over Weight");

            }
            else{
                lb2.setText("Obese");
            }
        }

    }

}
