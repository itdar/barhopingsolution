package jin.whenwho.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class WhenWhoController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	public void addButtonMouseClicked() {
    	System.out.println("addButtonMouseClicked");
//    	UrlTableContentDialog urlTableContentDialog = 
//    			new UrlTableContentDialog(new Stage(), urlTableList);
//    	urlTableContentDialog.addUrlDialog();
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
