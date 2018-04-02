package com.jin.ms.composite;

import com.jin.ms.visitor.Visitor;

public abstract class Component {
	protected String name = "";
	
	public abstract void accept(Visitor visitor);
	public abstract Component clone();
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
