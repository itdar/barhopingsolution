package com.jin.ms.main;

import com.jin.ms.composite.DDay;
import com.jin.ms.composite.DayMembers;
import com.jin.ms.composite.Location;
import com.jin.ms.composite.Member;
import com.jin.ms.member.AllMember;
import com.jin.ms.visitor.Visitor_PrintOut;

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
		
		AllMember allMember = AllMember.loadAllMember();
		
		Member ohj = new Member("ohj");
		Member kkw = new Member("kkw");
		Member ykw = new Member("ykw");
		Member lsb = new Member("lsb");
		Member bsh = new Member("bsh");
		Member kdy = new Member("kdy");
		
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
		
		System.out.println("			>> Finish to set DDay");
		System.out.println("");
		//Finish to set DDay /////////////////////////////////////////////////////////////////////

		DayMembers dayMembers = new DayMembers();
		dayMembers.add(allMember.getMember("ohj"));
		dayMembers.add(allMember.getMember("kkw"));
		dayMembers.add(allMember.getMember("kdy"));
		dayMembers.add(allMember.getMember("bsh"));
		
		for (int i = 0; i < dayMembers.getLength(); i++) {
			System.out.print(dayMembers.getList().get(i).getName());
			Member test = (Member)(dayMembers.getList().get(i));
			System.out.println(" " + test.getMoney());
		}
		
		System.out.println("			>> Finish to set DayMembers");
		System.out.println("");
		//Finish to make DayMembers //////////////////////////////////////////////////////////////
		
		Location location1 = new Location("Dinner with soju", 48700);
		dDay.add(location1);
		
		location1.add(dayMembers.get("ohj"));
		location1.add(dayMembers.get("kkw"));
		location1.distribution();
		
		System.out.println(location1.getName() + " " + location1.getMoney());
		for (int i = 0; i < location1.getLength(); i++) {
			System.out.print(location1.getList().get(i).getName());
			Member test = (Member)(location1.getList().get(i));
			System.out.println(" " + test.getMoney());
		}

		Location location2 = new Location("Desert cafe for waiting", 15000);
		dDay.add(location2);
		
		location2.add(dayMembers.get("ohj"));
		location2.add(dayMembers.get("kkw"));
		location2.add(dayMembers.get("kdy"));
		location2.distribution();
		
		System.out.println(location2.getName() + " " + location2.getMoney());
		for (int i = 0; i < location2.getLength(); i++) {
			System.out.print(location2.getList().get(i).getName());
			Member test = (Member)(location2.getList().get(i));
			System.out.println(" " + test.getMoney());
		}
		
		Location location3 = new Location("All together drinking makguli", 54000);
		dDay.add(location3);
		
		location3.add(dayMembers.get("ohj"));
		location3.add(dayMembers.get("kkw"));
		location3.add(dayMembers.get("kdy"));
		location3.add(dayMembers.get("bsh"));
		location3.distribution();
		
		System.out.println(location3.getName() + " " + location3.getMoney());
		for (int i = 0; i < location3.getLength(); i++) {
			System.out.print(location3.getList().get(i).getName());
			Member test = (Member)(location3.getList().get(i));
			System.out.println(" " + test.getMoney());
		}
		
		Location location4 = new Location("My life for Aiur", 38000);
		dDay.add(location4);
		
		location4.add(dayMembers.get("ohj"));
		location4.add(dayMembers.get("kdy"));
		location4.add(dayMembers.get("bsh"));
		location4.distribution();
		
		System.out.println(location4.getName() + " " + location4.getMoney());
		for (int i = 0; i < location4.getLength(); i++) {
			System.out.print(location4.getList().get(i).getName());
			Member test = (Member)(location4.getList().get(i));
			System.out.println(" " + test.getMoney());
		}
		
		System.out.println("			>> Finish to set Location");
		System.out.println("");
		//Finish to make Location //////////////////////////////////////////////////////////////
		
		// TODO Each location -> cloned member (need to check supervisor on each round
		
		dDay.accept(new Visitor_PrintOut());
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
