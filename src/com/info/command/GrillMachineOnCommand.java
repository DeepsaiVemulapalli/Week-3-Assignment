package com.info.command;

public class GrillMachineOnCommand implements Command {

	GrillMachine grillOn;
	
	
	
	public GrillMachineOnCommand(GrillMachine grillOn) {
		super();
		this.grillOn = grillOn;
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		grillOn.on();
	}

}
