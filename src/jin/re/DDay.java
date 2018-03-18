package jin.re;

public class DDay extends Composite {
	private String date;
	
	public DDay() {
		this.date = null;
	}
	public DDay(String name, String date) {
		this.name = name;
		this.date = date;
	}	
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return this.date;
	}
	
	
	public static void main(String args[]) {
		DDay dDay = new DDay("SuperCool", "2018-03-18");
		
		Location location = new Location("Cafe", 12000);
		
		Member ohj = new Member("ohj");
		Member kkw = new Member("kkw");
		
		location.add(ohj);
		location.add(kkw);
		
		
		
		
	}
}
