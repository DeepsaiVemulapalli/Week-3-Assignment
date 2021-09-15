package com.info.beans;

public class SmokedWings extends GrillChicken {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
       System.out.println("Started preparing Smoked SmokedWings ");
	}

	@Override
	protected void box() {
		// TODO Auto-generated method stub
		System.out.println("Started packing Smoked SmokedWings ");
	}

	@Override
	protected void serve() {
		// TODO Auto-generated method stub
		System.out.println("Serve the SmokedWings to cutsomers");
	}

}
