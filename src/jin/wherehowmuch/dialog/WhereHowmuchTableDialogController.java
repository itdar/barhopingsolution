package jin.wherehowmuch.dialog;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WhereHowmuchTableDialogController {
	
	@FXML private TextField whereTextField;
	@FXML private TextField howmuchTextField;
	@FXML private Button okButton;
	@FXML private Button cancelButton;
	
	private Stage dialogStage;
	private StringProperty oldWhere;
	private StringProperty oldHowmuch;
	
	private void initialize() {
		
    }
	    
	public WhereHowmuchTableDialogController() {
		
	}
	
	public void onOkButtonMouseClicked() {
		System.out.println("onOkButtonMouseClicked");
		String tempString1 = whereTextField.getText();
		String tempString2 = howmuchTextField.getText();
		oldWhere.set(tempString1);
		oldHowmuch.set(tempString2);
		dialogStage.close();
	}
	
	public void onCancelButtonMouseClicked() {
		System.out.println("onCancelButtonMouseClicked");
		dialogStage.close();
	}

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
    
    public void setOldWhere(StringProperty stringProperty) {
    	oldWhere = stringProperty;
    	whereTextField.setText(stringProperty.get());
    }
    public void setOldHowmuch(StringProperty stringProperty) {
    	oldWhere = stringProperty;
    	howmuchTextField.setText(stringProperty.get());
    }
}
