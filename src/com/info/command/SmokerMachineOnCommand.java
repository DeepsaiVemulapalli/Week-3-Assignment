package com.info.command;

public class SmokerMachineOnCommand implements Command{
    
	SmokerMachine smokeMachine;
	
	
	
	public SmokerMachineOnCommand(SmokerMachine smokeMachine) {
		super();
		this.smokeMachine = smokeMachine;
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
		smokeMachine.on();
	}

}
