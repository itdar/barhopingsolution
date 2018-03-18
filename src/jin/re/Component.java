package jin.re;

abstract class Component {
	protected String name = null;
	
	protected String getName() {
		return this.name;
	}
	protected void setName(String name) {
		this.name = name;
	}
}
