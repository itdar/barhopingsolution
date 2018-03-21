package com.jin.ms.composite;

import com.jin.ms.visitor.Visitor;
import com.jin.ms.visitor.Visitor_PrintOut;

public class DDay extends Composite {
	private String date;
	
	public DDay() {
		this.date = null;
	}
	public DDay(String name, String date) {
		this.name = name;
		this.date = date;
	}	
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return this.date;
	}
	
	
//	public static void main(String args[]) {
//		
//		
//	}
	
}
