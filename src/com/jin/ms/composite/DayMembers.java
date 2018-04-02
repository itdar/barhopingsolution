package com.jin.ms.composite;

import com.jin.ms.visitor.Visitor;

public class DayMembers extends Composite {
	private int length;
	
	public DayMembers() {
		this.length = 0;
	}
	public DayMembers(DayMembers source) {
		for (int i = 0; i < source.list.size(); i++) {
			this.list.add(source.list.get(i).clone());
		}
		this.length = source.length;
	}
	
	public void add(Member member) {
		this.list.add(member.clone());
		this.length++;
	}
	
	@Override
	public Component clone() {
		return new DayMembers(this);
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}
	
	public int getLength() {
		return this.length;
	}
}
