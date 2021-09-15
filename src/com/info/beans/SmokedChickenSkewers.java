package com.info.beans;

public class SmokedChickenSkewers extends GrillChicken {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
       System.out.println("Started preparing Smoked SmokedChickenSkewers ");
	}

	@Override
	protected void box() {
		// TODO Auto-generated method stub
		System.out.println("Started packing Smoked SmokedChickenSkewers ");
	}

	@Override
	protected void serve() {
		// TODO Auto-generated method stub
		System.out.println("Serve the SmokedChickenSkewers to cutsomers");
	}

}
