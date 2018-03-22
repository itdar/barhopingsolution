package com.jin.ms.main;

import com.jin.ms.composite.DDay;
import com.jin.ms.composite.Location;
import com.jin.ms.composite.Member;
import com.jin.ms.visitor.Visitor_PrintOut;

public class MainMS {
	
	public static void main(String args[]) {
		DDay dDay = new DDay("SuperCool", "2018-03-18");

		Location location = new Location("Cafe", 12000);

		Member ohj = new Member("ohj");
		Member kkw = new Member("kkw");

		location.add(ohj);
		location.add(kkw);

		dDay.add(location);

		dDay.accept(new Visitor_PrintOut());
		DDay dDay2 = new DDay(dDay);
		dDay2.accept(new Visitor_PrintOut());
		
		Member tester = new Member("tester");
		location.add(tester);
		
		dDay.accept(new Visitor_PrintOut());
		dDay2.accept(new Visitor_PrintOut());
	}
}
