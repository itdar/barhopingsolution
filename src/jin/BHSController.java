package jin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class BHSController implements Initializable {
	@FXML private AnchorPane whereHowmuchPane;
	@FXML private AnchorPane whenWhoPane;
	@FXML private AnchorPane resultPane;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("BHSController initialize");
		showWhereHowmuchPane();
	}
	
	public BHSController() { // Constructor
		System.out.println("BHSController Constructor");
//		whereHowmuchPane = new AnchorPane();
	}
	
	public void showWhereHowmuchPane() {
        try {
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(this.getClass().getResource("wherehowmuch/gui/WhereHowmuch.fxml"));
            AnchorPane _whereHowmuchPane = (AnchorPane) loader1.load();
//            rootPane.getChildren().add(whenWhoPane);
            this.whereHowmuchPane.getChildren().add(_whereHowmuchPane);
//            this.whereHowmuchPane.setTopAnchor(_whereHowmuchPane, null);
            System.out.println("showWhereHowmuchPane");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
    /*public void showWhenWhoPane() {
        try {
            FXMLLoader loader2 = new FXMLLoader();
            loader2.setLocation(this.getClass().getResource("whenwho/gui/WhenWho.fxml"));
            AnchorPane _whenWhoPane = (AnchorPane) loader2.load();
//            rootPane.getChildren().add(whenWhoPane);
            
            this.whenWhoPane.setTopAnchor(_whenWhoPane, null);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showResultPane() {
        try {
            FXMLLoader loader3 = new FXMLLoader();
            loader3.setLocation(this.getClass().getResource("result/gui/ResultCalc.fxml"));
            AnchorPane _resultPane = (AnchorPane) loader3.load();
            
            this.resultPane.setTopAnchor(_resultPane, null);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
