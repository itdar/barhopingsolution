package jin.re;

public class Location extends Composite {
	
	private int money;
	
	public Location() {
		this.money = 0;
	}
	public Location(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
}
