package jin.re;

import java.util.HashMap;

public class Location {
	private HashMap<String, Member> members = new HashMap<String, Member>();
	
	private String name;
	private int money;
	private int memberNumber;
	
	public Location() {
		this.name = null;
		this.money = -1;
		this.memberNumber = 0;
	}
	public Location(String name, int money) {
		this.name = name;
		this.money = money;
		this.memberNumber = 0;
	}	
	
	
	public void addMember(Member member) {
		this.members.put(member.getName(), member);
		this.memberNumber++;
	}
	public Member getMember(String memberName) {
		return this.members.get(memberName);
	}
	public void removeMember(String memberName) {
		this.members.remove(memberName);
		this.memberNumber--;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return this.name;
	}
	public int getMoney() {
		return this.money;
	}
}
