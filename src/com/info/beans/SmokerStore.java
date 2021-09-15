package com.info.beans;

public class SmokerStore extends Restaurant {

	@Override
	protected GrillChicken createGrillChicken(String item) {
		GrillChicken chicken = null;

		if (item.equals("smokedWings")) {
			chicken = new SmokedWings();
			chicken.setName("Smoked Chicken Wings");
		} else if (item.equals("SmokedChickenSkewers")) {
			chicken = new SmokedChickenSkewers();
			chicken.setName("Smoked Chicken Skewers");
		}
		return chicken;
	}

}
