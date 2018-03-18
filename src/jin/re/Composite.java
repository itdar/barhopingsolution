package jin.re;

import java.util.HashMap;

abstract class Composite extends Component {
	protected HashMap<String, Component> componentMap = new HashMap<String, Component>();
	protected int mapLength = 0;

	protected void add(Component component) {
		this.componentMap.put(component.getName(), component);
		this.mapLength++;
	}
	protected void remove(String componentName) {
		this.componentMap.remove(componentName);
		this.mapLength--;
	}
	protected Component getChild(String componentName) {
		return componentMap.get(componentName);
	}
	
	
	protected void setComponentMap(HashMap<String, Component> componentMap) {
		this.componentMap = componentMap;
	}
	
	protected HashMap<String, Component> getComponentMap() {
		return this.componentMap;
	}
	protected int getMapLength() {
		return this.mapLength;
	}
	
}
