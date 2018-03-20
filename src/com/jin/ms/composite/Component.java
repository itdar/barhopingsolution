package com.jin.ms.composite;

import com.jin.ms.visitor.Visitor;

public abstract class Component {
	protected String name = null;
	
	public abstract void accept(Visitor visitor);
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
