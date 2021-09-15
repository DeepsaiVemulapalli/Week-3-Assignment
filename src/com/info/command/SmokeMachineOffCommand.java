package com.info.command;

public class SmokeMachineOffCommand implements Command {
 
	SmokerMachine smokeMachine;
	
	
	
	public SmokeMachineOffCommand(SmokerMachine smokeMachine) {
		super();
		this.smokeMachine = smokeMachine;
	}



	@Override
	public void execute() {
		// TODO Auto-generated method stub
       smokeMachine.off();
	}

}
