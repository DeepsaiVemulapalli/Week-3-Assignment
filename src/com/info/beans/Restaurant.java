package com.info.beans;

public abstract class Restaurant {
	

	protected abstract GrillChicken createGrillChicken(String item);

	
	public GrillChicken orderGrill(String type) {
		GrillChicken grillChicken = createGrillChicken(type);
		System.out.println("----Making a "+ grillChicken.getName());
		grillChicken.prepare();
		grillChicken.box();
		grillChicken.serve();
		return grillChicken;
	}

}
