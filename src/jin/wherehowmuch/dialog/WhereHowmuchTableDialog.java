package jin.wherehowmuch.dialog;

import java.io.IOException;

import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import jin.wherehowmuch.table.WhereHowmuchTableProperty;

public class WhereHowmuchTableDialog {
	private Stage primaryStage;
	private ObservableList<WhereHowmuchTableProperty> whTableViewList;
	private WhereHowmuchTableProperty whTableProperty;
	
	public WhereHowmuchTableDialog(Stage stage, ObservableList<WhereHowmuchTableProperty> whTableViewList) {
		this.primaryStage = stage;
		this.whTableViewList = whTableViewList;
	}
	public WhereHowmuchTableDialog(Stage stage, WhereHowmuchTableProperty whTableProperty) {
		this.primaryStage = stage;
		this.whTableProperty = whTableProperty;
	}
	
	public void addDialog() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(WhereHowmuchTableDialog.class.getResource("WhereHowmuchTableDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			
			Scene scene = new Scene(page);
			primaryStage.setScene(scene);
			
			WhereHowmuchTableDialogController controller = loader.getController();
			controller.setDialogStage(primaryStage);
			
			primaryStage.initModality(Modality.APPLICATION_MODAL);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void editDialog() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(WhereHowmuchTableDialog.class.getResource("WhereHowmuchTableDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			
			Scene scene = new Scene(page);
			primaryStage.setScene(scene);
			
			WhereHowmuchTableDialogController controller = loader.getController();
			controller.setDialogStage(primaryStage);
//			controller.setOldMemo(whTableProperty.getMemoProperty());
			controller.setOldWhere(whTableProperty.getWhereProperty());
			controller.setOldHowmuch(whTableProperty.getHowmuchProperty());
			
			primaryStage.initModality(Modality.APPLICATION_MODAL);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
