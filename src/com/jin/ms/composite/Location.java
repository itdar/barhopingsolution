package com.jin.ms.composite;

import com.jin.ms.visitor.Visitor;

public class Location extends Composite {
	
	private int money;
	
	public Location() {
		this.money = 0;
	}
	public Location(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
}
