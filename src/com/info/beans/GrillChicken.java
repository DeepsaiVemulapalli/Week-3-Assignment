package com.info.beans;

public abstract class GrillChicken {

	private String name;

	private Chicken chickenTypes;

	private Onion onions;

	@Override
	public String toString() {
		return "GrillChicken [name=" + name + "]";
	}

	public abstract void prepare();

	protected abstract void box();

	protected abstract void serve();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chicken getChickenTypes() {
		return chickenTypes;
	}

	public void setChickenTypes(Chicken chickenTypes) {
		this.chickenTypes = chickenTypes;
	}

	public Onion getOnions() {
		return onions;
	}

	public void setOnions(Onion onions) {
		this.onions = onions;
	}

}
