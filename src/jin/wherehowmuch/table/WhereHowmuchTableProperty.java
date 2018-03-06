package jin.wherehowmuch.table;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class WhereHowmuchTableProperty {
	private StringProperty number;
	private StringProperty where;
	private StringProperty howmuch;
	
	public WhereHowmuchTableProperty() {
	}
	
	public WhereHowmuchTableProperty(String number, String where, String howmuch) {
		this.number = new SimpleStringProperty(number);
		this.where = new SimpleStringProperty(where);
		this.howmuch = new SimpleStringProperty(howmuch);
	}
	
	public StringProperty getNumberProperty() {
		return this.number;
	}
	public StringProperty getWhereProperty() {
		return this.where;
	}
	public StringProperty getHowmuchProperty() {
		return this.howmuch;
	}
	
	public void setNumber(String number) {
		this.number.set(number);
	}
	public void setWhere(String where) {
		this.where.set(where);
	}
	public void setHowmuch(String howmuch) {
		this.howmuch.set(howmuch);
	}
}
