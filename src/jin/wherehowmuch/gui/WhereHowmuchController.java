package jin.wherehowmuch.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import jin.wherehowmuch.dialog.WhereHowmuchTableDialog;
import jin.wherehowmuch.table.WhereHowmuchTableProperty;

public class WhereHowmuchController implements Initializable {
	@FXML private Button addButton;
	@FXML private Button deleteButton;
	@FXML private TableView whereHowmuchTableView;
	
	@FXML private TableView<WhereHowmuchTableProperty> whTableView;
	@FXML private TableColumn<WhereHowmuchTableProperty, String> numberColumn;
	@FXML private TableColumn<WhereHowmuchTableProperty, String> whereColumn;
	@FXML private TableColumn<WhereHowmuchTableProperty, String> howmuchColumn;
	private ObservableList<WhereHowmuchTableProperty> whTableViewList;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
//		urlTableList = FXCollections.observableArrayList();
//		urlNumberColumn.setCellValueFactory(cellData -> cellData.getValue().getUrlNumberProperty());
//		nameColumn.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());
//		isExistColumn.setCellValueFactory(cellData -> cellData.getValue().getIsExistProperty());
//		urlColumn.setCellValueFactory(cellData -> cellData.getValue().getUrlProperty());
//		
//		//TODO need to make save and load
//		UrlTableContents urlTableContents1 = 
//				new UrlTableContents("1", "Seoul Univ", "", "http://www.snuh.org/board/B004/list.do");
//		UrlTableContents urlTableContents2 = 
//				new UrlTableContents("2", "Yonsei cancer center", "", "http://sev.iseverance.com/cancer/guidance/news/news/");
//		
//		urlTableList.add(urlTableContents1);
//		urlTableList.add(urlTableContents2);
//		urlTableView.setItems(urlTableList);
//		
//		urlTableView.setOnMousePressed(new EventHandler<MouseEvent>() {
//			@Override 
//		    public void handle(MouseEvent event) {
//		        if (event.isPrimaryButtonDown() && event.getClickCount() == 2) {
//		        	editUrlDialog();
//		        }
//		    }
//		});
	}
	
	
	public WhereHowmuchController() { // Constructor
		System.out.println("WhereHowmuchController Constructor");
		
	}
	
    public void addButtonMouseClicked() {
    	System.out.println("addButtonMouseClicked");
    	WhereHowmuchTableDialog whereHowmuchTableDialog = 
    			new WhereHowmuchTableDialog(new Stage(), whTableViewList);
    	whereHowmuchTableDialog.addDialog();
    	
    }
    
    public void deleteButtonMouseClicked() {
    	System.out.println("deleteButtonMouseClicked");
//		int selectedIndex = urlTableView.getSelectionModel().getSelectedIndex();
//		if (selectedIndex > -1) {
//			urlTableView.getItems().remove(selectedIndex);
//		} else {
//			Alert alert = new Alert(AlertType.WARNING);
//	        alert.setTitle("No Selection");
//	        alert.setHeaderText("No URL Selected");
//	        alert.setContentText("Please select a URL in the table.");
//	        alert.showAndWait();
//		}
    }
    
    public void editUrlDialog() {
//		UrlTableContentDialog dialog = new UrlTableContentDialog(
//				new Stage(), urlTableList.get(urlTableView.getSelectionModel().getSelectedIndex()));
//		dialog.editUrlDialog();
	}
}
