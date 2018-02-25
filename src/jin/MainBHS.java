package jin;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainBHS extends Application {
	private Stage primaryStage;
    private AnchorPane rootPane;
    
    private SplitPane vertSplitPane;
    private SplitPane horzSplitPane;
    private AnchorPane upperPane;
    
//    private Stage whereHowmuchStage = new Stage();
    private Stage whenWhoStage; 
    private Stage resultCalcStage;

    @FXML private AnchorPane whereHowmuchPane = new AnchorPane();
//    @FXML private AnchorPane whenWhoPane = new AnchorPane();
//    @FXML private AnchorPane resultCalcPane;
    
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
            rootPane = (AnchorPane) loader.load();
            
            Scene scene = new Scene(rootPane);
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
            whereHowmuchPane = (AnchorPane) loader.load();
            
            System.out.println(rootPane.getChildren().size());
            rootPane.getChildren().add(whereHowmuchPane);
            System.out.println(rootPane.getChildren().size());
            
//            whereHowmuchPane.setTopAnchor(whereHowmuchPane, null);
            
//            rootLayout.setTopAnchor(whereHowmuchPane, null);
//            whereHowmuchStage.setScene(new Scene(whereHowmuchPane));
//            whereHowmuchStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    public void showWhenWhoPane() {
        try {
            FXMLLoader loader3 = new FXMLLoader();
            loader3.setLocation(MainBHS.class.getResource("whenwho/gui/WhenWho.fxml"));
            whenWhoPane = (AnchorPane) loader3.load();
            rootPane.getChildren().add(whenWhoPane);
            
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
    }*/

    public Stage getPrimaryStage() {
        return primaryStage;
    }

	public static void main(String[] args) {
		launch(args);
		
		System.gc();
	}
}
