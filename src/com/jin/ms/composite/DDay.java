package com.jin.ms.composite;

import com.jin.ms.visitor.Visitor;
import com.jin.ms.visitor.Visitor_PrintOut;

public class DDay extends Composite {
	private String date;
	private Member supervisor;
	
	public DDay() {
		this.date = null;
		this.supervisor = null;
	}
	public DDay(String name, String date) {
		this.name = name;
		this.date = date;
		this.supervisor = null;
	}
	public DDay(DDay source) {
		for (int i = 0; i < source.list.size(); i++) {
			this.list.add(source.list.get(i).clone());
		}
		this.name = source.name;
		this.date = source.date;
		this.supervisor = source.supervisor;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	@Override
	public Component clone() {
		return new DDay(this);
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return this.date;
	}
	public void setSupervisor(Member supervisor) {
		this.supervisor = supervisor;
	}
	public Member getSupervisor() {
		return this.supervisor;
	}
	
	
//	public static void main(String args[]) {
//		DDay dDay1 = new DDay("dDay1", "2018-08-29");
//		DDay dDay2 = new DDay(dDay1);
//		
//		System.out.println(dDay1.getName());
//		System.out.println(dDay2.getName());
//		
//		dDay1.setName("dDay3");
//		System.out.println(dDay1.getName());
//		System.out.println(dDay2.getName());
//	}
	
}
