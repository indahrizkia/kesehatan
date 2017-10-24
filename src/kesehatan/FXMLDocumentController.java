/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField nama;
    @FXML
    private RadioButton laki;
    @FXML
    private RadioButton perempuan;
    @FXML
    private TextField tinggi;
    @FXML
    private TextField berat;
    @FXML
    private JFXButton btnproses;
    @FXML
    private JFXButton btnreset;
    @FXML
    private TextField idealw;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String Nama = nama.getText();
        String Tinggi = tinggi.getText();
        String Berat = berat.getText();
        
        String Pilihan = "";     
        double ideal=0;
        double ting = Double.parseDouble(tinggi.getText());  
        double ber = Double.parseDouble(berat.getText());
        if (perempuan.isSelected()){
            Pilihan = "Female";
            ideal = ting-100;
         }
        else if (laki.isSelected()){
            Pilihan = "Male";
         ideal = ting-110;}
        
        String kate="";
        String Saran="";
        if (ber<ideal){
            kate="Underweight";
            Saran="Lets Eat !";
         }
        else if (ber==ideal){
            kate="Ideal";
        Saran="Good Job !";}
        else if (ber>ideal){
            kate="Overweight";
        Saran="Lets Sport !";}
        hasil.setText("Name: "+Nama+"\nHeight: "+Tinggi+" cm \nWeight : "+Berat+" Kg \nGender : "+Pilihan+"\n"+kate);
        idealw.setText(""+ideal);
        saran.setText(""+Saran);
       
    }

    @FXML
    private void reset(ActionEvent event) {
        hasil.setText("");
        saran.setText("");
        idealw.setText("");
        nama.setText("");
        tinggi.setText("");
        perempuan.setSelected(false);
        laki.setSelected(false);
        berat.setText("");
    }
    
}
