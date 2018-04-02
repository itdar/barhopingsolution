package com.jin.ms.visitor;

import com.jin.ms.composite.DDay;
import com.jin.ms.composite.DayMembers;
import com.jin.ms.composite.Location;
import com.jin.ms.composite.Member;

public class Visitor_PrintOut implements Visitor {

	@Override
	public void visit(DDay dDay) {
		System.out.println(dDay.getName() + " " + dDay.getDate());
		for (int i = 0; i < dDay.getList().size(); i++) {
			dDay.get(i).accept(this);
		}
	}

	@Override
	public void visit(Location location) {
		System.out.println("	" + location.getName() + " " + location.getMoney());
		for (int i = 0; i < location.getList().size(); i++) {
			location.get(i).accept(this);
		}
	}
	
	@Override
	public void visit(DayMembers dayMembers) {
		for (int i = 0; i < dayMembers.getLength(); i++) {
			dayMembers.getList().get(i).accept(this);
		}		
	}
	
	@Override
	public void visit(Member member) {
		System.out.println("		" + member.getName() + " " + member.getMoney());
	}


}
