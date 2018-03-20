package com.jin.ms.visitor;

import com.jin.ms.composite.DDay;
import com.jin.ms.composite.Location;
import com.jin.ms.composite.Member;

public interface Visitor {
	
	abstract void visit(DDay dDay);
	abstract void visit(Location location);
	abstract void visit(Member member);
}
