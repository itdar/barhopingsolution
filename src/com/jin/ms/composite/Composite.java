package com.jin.ms.composite;

import java.util.ArrayList;
import java.util.List;

import com.jin.ms.visitor.Visitor;

abstract class Composite extends Component {
	public List<Component> list = new ArrayList<Component>();

	public void add(Component component) {
		this.list.add(component);
	}
	
	public void remove(Component component) {
		this.list.remove(component);
	}
	public void remove(int index) {
		this.list.remove(index);
	}
	
	public Component getChild(int index) {
		return this.list.get(index);
	}
	
	public abstract Component clone();
	
	
	public void setList(List<Component> list) {
		this.list = list;
	}
	public List<Component> getList() {
		return this.list;
	}	
}
