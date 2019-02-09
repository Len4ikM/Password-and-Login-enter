package application;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
 
public class MyController implements Initializable {
 
   @FXML
   private Button myButton;
  
   @FXML
   private TextField login;
   @FXML
   private PasswordField b;   
   @FXML
   private Text c;
   
   @Override
   public void initialize(URL location, ResourceBundle resources) {
       // TODO (don't really need to do anything here).
   }
 
   // When user click on myButton
   // this method will be called.
   public void showDateTime(ActionEvent event) {
      
      
       Date now= new Date();
      
       DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
      
      
        // Model Data
        String dateTimeString = df.format(now);
   
        // Show in VIEW
        String a1;
        String b1;
        a1=login.getText();
        b1=b.getText();
        if(a1.equals("Margulis")&&b1.equals("12345"))
        {
       
        	c.setText("Correct");
        
        	
        }else {
        	c.setText("Incorrect");
        }
        
       
        
      
   }
}
