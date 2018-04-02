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
	public Location(Location source) {
		for (int i = 0; i < source.list.size(); i++) {
			this.list.add(source.list.get(i).clone());
		}
		this.name = source.name;
		this.money = source.money;
	}
	
	public void distribution() {
		int share = money / this.getLength();
		for (int i = 0; i < this.getLength(); i++) {
			Member member = (Member) this.get(i);
			member.plusMoney(share);
		}
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	@Override
	public Location clone() {
		return new Location(this);
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	public int getLength() {
		return this.list.size();
	}
}
