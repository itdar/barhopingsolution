package jin;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainAppBHS extends Application {
	private Stage primaryStage;
    private BorderPane rootPane;
    
	public void start(Stage primaryStage) { 
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("It's on us, dude");
        
        initRootLayout();
        showBhsPane();
	}
	
    public void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainAppBHS.class.getResource("RootLayout.fxml"));
            rootPane = (BorderPane) loader.load();
            
            Scene scene = new Scene(rootPane);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showBhsPane() {
        try {
        	FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainAppBHS.class.getResource("BHS.fxml"));
            AnchorPane helloWorld = (AnchorPane) loader.load();
            
            rootPane.setCenter(helloWorld);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

	public static void main(String args[]) {
		launch(args);
		
		System.gc();
	}
}
