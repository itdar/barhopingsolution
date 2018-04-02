package com.jin.ms.main;

import com.jin.ms.composite.DDay;
import com.jin.ms.composite.DayMembers;
import com.jin.ms.composite.Member;
import com.jin.ms.member.AllMember;

public class MainMS {
	
	public static void main(String args[]) {
		// Process
		// 0. Add Members to AllMember
		
		// 1. Set DDay
		// 2. Designate DayMembers from AllMembers (clone)
		// 3. Set Location and Select Member(s) from DayMembers (do not clone)
		//  3.1. Divide and PlusMoney to each Member,
		//Need to add supervisor function for each Location
		// 4. Print out and check
		
		Member ohj = new Member("ohj");
		Member kkw = new Member("kkw");
		Member ykw = new Member("ykw");
		Member lsb = new Member("lsb");
		Member bsh = new Member("bsh");
		Member kdy = new Member("kdy");
		
		AllMember allMember = AllMember.loadAllMember();
		allMember.putMember(ohj);
		allMember.putMember(kkw);
		allMember.putMember(ykw);
		allMember.putMember(lsb);
		allMember.putMember(bsh);
		allMember.putMember(kdy);
		
		ohj = allMember.getMember("ohj");
		System.out.println(ohj.getName() + " " + ohj.getMoney());
		kkw = allMember.getMember("kkw");
		System.out.println(kkw.getName() + " " + kkw.getMoney());
		ykw = allMember.getMember("ykw");
		System.out.println(ykw.getName() + " " + ykw.getMoney());
		lsb = allMember.getMember("lsb");
		System.out.println(lsb.getName() + " " + lsb.getMoney());
		bsh = allMember.getMember("bsh");
		System.out.println(bsh.getName() + " " + bsh.getMoney());
		kdy = allMember.getMember("kdy");
		System.out.println(kdy.getName() + " " + kdy.getMoney());
		
		System.out.println("		>> Finish to make AllMember");
		System.out.println("");
		//Finish made AllMembers /////////////////////////////////////////////////////////////////
		
		DDay dDay = new DDay("Super", "2018-03-31");
		
		System.out.println(dDay.getName() + " " + dDay.getDate());
		
		System.out.println("		>> Finish to set DDay");
		System.out.println("");
		//Finish to set DDay /////////////////////////////////////////////////////////////////////

		DayMembers dayMembers = new DayMembers();
		dayMembers.add(allMember.getMember("ohj"));
		
		//Finish to make DayMembers //////////////////////////////////////////////////////////////
		
//		Location location = new Location("Cafe", 12000);
//
//		location.add(ohj);
//		location.add(kkw);
//
//		dDay.add(location);
//
//		dDay.accept(new Visitor_PrintOut());
//		DDay dDay2 = new DDay(dDay);
//		dDay2.accept(new Visitor_PrintOut());
//		
//		Member tester = new Member("tester");
//		location.add(tester);
//		
//		dDay.accept(new Visitor_PrintOut());
//		dDay2.accept(new Visitor_PrintOut());
	}
}
