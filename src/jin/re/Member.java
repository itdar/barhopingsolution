package jin.re;

public class Member {
	private String name;
	private int money;
	
	public Member() {
		this.name = null;
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
	
	public String getName() {
		return this.name;
	}
	public int getMoney() {
		return this.money;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
