package com.jin.ms.member;

import java.util.HashMap;

import com.jin.ms.composite.Member;

public class AllMember {
	private HashMap<String, Member> allMember;
	private int length;
	
	public AllMember() {
		this.length = 0;
	}
	public AllMember(HashMap<String, Member> allMember) {
		this.allMember = allMember;
		this.length = allMember.size();
	}
	
	public Member getMember(String name) {
		if (length > 0) {
			length--;
			return this.allMember.get(name);
		} else return null;
	}
	public void putMember(Member member) {
		this.allMember.put(member.getName(), member);
		this.length++;
	}
	
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
