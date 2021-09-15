package com.info.beans;

public class GrilledChickenWings extends GrillChicken {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Started preparing the GrilledChickenWings Chicken");
		
	}

	@Override
	protected void box() {
		// TODO Auto-generated method stub
		System.out.println("Pack the GrilledChickenWings ");
		
	}

	@Override
	protected void serve() {
		// TODO Auto-generated method stub
		System.out.println("Serve GrilledChickenWings to customer ");
	}

}
