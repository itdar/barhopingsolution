package com.jin.ms.composite;

import java.util.ArrayList;
import java.util.List;

import com.jin.ms.visitor.Visitor;

public class Location extends Composite {
	
	
	public Location() {
		
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
	
	/**
	 * 기존 DayMembers와 연결된 Member는 Plus해주고 / 연결되어있던 Member들을 
	 * Clone 해서 따로 해당 차의 나눈 돈을 Set 해주고 Location이 갖도록 저장한다.
	 */
	public void distribution() {
		List<Component> tempList = new ArrayList<Component>();
		for (int i = 0; i < this.getLength(); i++) {
			tempList.add(((Member)this.list.get(i).clone()));
		}
		int share = money / this.getLength();
		for (int i = 0; i < this.getLength(); i++) {
			// Accumulation -> plusMoney / Each round money -> setMoney
			((Member)tempList.get(i)).setMoney(share);
			((Member) this.get(i)).plusMoney(share);
		}
		this.setList(tempList);
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
