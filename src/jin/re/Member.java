package jin.re;

public class Member extends Component {
	private int money;
	
	public Member() {
		this.money = 0;
	}
	public Member(String name) {
		this.name = name;
		this.money = 0;
	}
	public Member(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	public void plusMoney(int money) {
		this.money += money;
	}
	public void minusMoney(int money) {
		this.money -= money;
	}
	
	
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
}
