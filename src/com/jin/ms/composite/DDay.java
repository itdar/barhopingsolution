package com.jin.ms.composite;

import com.jin.ms.visitor.Visitor;
import com.jin.ms.visitor.Visitor_PrintOut;

public class DDay extends Composite {
	public DayMembers members;
	private String date;
	
	public DDay() {
		this.members = new DayMembers();
		this.date = null;
	}
	public DDay(String name, String date) {
		this.members = new DayMembers();
		this.name = name;
		this.date = date;
	}
	public DDay(DDay source) {
		for (int i = 0; i < source.list.size(); i++) {
			this.list.add(source.list.get(i).clone());
		}
		this.name = source.name;
		this.date = source.date;
	}
	
	public void distribution() {
		
		for (int i = 0; i < this.list.size(); i++) {
			Location location = (Location)this.list.get(i);
			for (int j = 0; j < location.list.size(); j++) {
				Member member = (Member)location.list.get(j);
			}
		}
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
