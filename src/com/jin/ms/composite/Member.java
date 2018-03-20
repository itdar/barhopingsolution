package com.jin.ms.composite;

import com.jin.ms.visitor.Visitor;

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
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
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
