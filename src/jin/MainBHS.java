package jin;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainBHS extends Application {
	private Stage primaryStage;
    private AnchorPane rootLayout;
    
    private Stage whereHowmuchStage;
    private Stage whenWhoStage; 
    private Stage resultCalcStage;

    @FXML private BorderPane whereHowmuchBorderPane;
    @FXML private AnchorPane whenWhoPane;
    @FXML private AnchorPane resultCalcPane;
    
	public void start(Stage primaryStage) { 
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("It's on us, dude");
        
        initRootLayout();
        showWhereHowmuchPane();
//        showWhenWhoPane();
//        showResultPane();
	}
	
    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainBHS.class.getResource("BHS.fxml"));
            rootLayout = (AnchorPane) loader.load();
            
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showWhereHowmuchPane() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainBHS.class.getResource("wherehowmuch/gui/WhereHowmuch.fxml"));
            whereHowmuchBorderPane = (BorderPane) loader.load();
            rootLayout.setTopAnchor(whereHowmuchBorderPane, null);;
//            whereHowmuchStage.setScene(new Scene(whereHowmuchPane));
//            whereHowmuchStage.show();
            
//            whereHowmuchPane.setTopAnchor(whereHowmuchPane, null);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showWhenWhoPane() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainBHS.class.getResource("whenwho/gui/WhenWho.fxml"));
            whenWhoPane = (AnchorPane) loader.load();
            
//            this.whenWhoPane.setTopAnchor(_whenWhoPane, null);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showResultPane() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainBHS.class.getResource("result/gui/ResultCalc.fxml"));
            AnchorPane _resultCalcPane = (AnchorPane) loader.load();
            
            this.resultCalcPane.setTopAnchor(_resultCalcPane, null);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

	public static void main(String[] args) {
		launch(args);
		
		System.gc();
	}
}
