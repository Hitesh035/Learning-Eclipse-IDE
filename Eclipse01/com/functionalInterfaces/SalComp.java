package com.functionalInterfaces;

import java.util.Comparator;

public class SalComp implements Comparator<Employees> {
	
	@Override
	public int compare(Employees e1, Employees e2) {
		
		if (e1.sal > e2.sal) return 1;
		else if (e1.sal<e2.sal) return -1;
		return 0;
	}

}
