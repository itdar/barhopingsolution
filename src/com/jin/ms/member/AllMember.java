package com.jin.ms.member;

import java.util.HashMap;

import com.jin.ms.composite.Member;

//Need to check Enum class for singleton
public class AllMember {
	private static AllMember instance;
	
	private HashMap<String, Member> allMember = new HashMap<String, Member>();
	private int length;
	
	public AllMember() {
		this.length = 0;
	}
	public AllMember(HashMap<String, Member> allMember) {
		this.allMember = allMember;
		this.length = allMember.size();
	}
	
	public static AllMember loadAllMember() {
		if (instance == null) {
			instance = new AllMember();
		}
		return instance;
	}
	
	public Member getMember(String name) {
		return this.allMember.get(name);
	}
	public void putMember(Member member) {
		this.allMember.put(member.getName(), member);
		this.length++;
	}
	// overload putMember(String name)
	
	public void setAllMember(HashMap<String, Member> allMember) {
		this.allMember = allMember;
		this.length = allMember.size();
	}
	
	public HashMap<String, Member> getAllMember() {
		return this.allMember;
	}
	public int getLength() {
		return this.length;
	}
}
