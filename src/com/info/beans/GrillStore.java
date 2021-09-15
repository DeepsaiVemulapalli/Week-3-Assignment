package com.info.beans;

public class GrillStore  extends Restaurant{
	
	@Override
	protected GrillChicken createGrillChicken(String item) {
		// TODO Auto-generated method stub
		GrillChicken chicken= null;
		
		if (item.equals("GrilledChickenWings")) {
			chicken = new GrilledChickenWings();
			chicken.setName("Grilled Chicken Wings");
			 }
		else if(item.equals("ItalianChickenSkewers")) {
			chicken = new ItalianChickenSkewers();
			chicken.setName("Italian Chicken Skewers");
		}
		return chicken;
	}

}
