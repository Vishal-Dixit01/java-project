
package project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    public  void handleButtonAction(ActionEvent event) 
    {
        try
        {
           FXMLLoader loader=new FXMLLoader(getClass().getResource("welcome_window.fxml"));
           Parent root1=(Parent) loader.load();
           Stage s=new Stage();
           s.setTitle("welcome to the new window");
           Scene scene =new Scene(root1);
           s.setScene(scene);
           s.show();
        }
        catch(Exception e)
        {
            System.out.println("sorry!");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
