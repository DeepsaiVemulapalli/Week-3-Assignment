package com.info.command;

public class GrillMachineOffCommand implements Command{
	
	GrillMachine grillOff;

	public GrillMachineOffCommand(GrillMachine grillOff) {
		this.grillOff = grillOff;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		grillOff.off();
	}

}
