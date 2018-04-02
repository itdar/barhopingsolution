package com.jin.ms.composite;

import com.jin.ms.visitor.Visitor;

public class Member extends Component {
	private int money;
	// 계좌명 / 은행명 / 전화번호  // 옵션 - Builder pattern
	
	private Member() {
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
	public Member(Member source) {
		this.name = source.name;
		this.money = source.money;
	}
		
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	@Override
	public Member clone() {
		return new Member(this);
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
