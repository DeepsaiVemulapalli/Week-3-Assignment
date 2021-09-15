package com.info.client;

import com.info.beans.GrillChicken;
import com.info.beans.GrillStore;
import com.info.beans.Restaurant;
import com.info.beans.SmokerStore;
import com.info.command.GrillMachine;
import com.info.command.GrillMachineOffCommand;
import com.info.command.GrillMachineOnCommand;
import com.info.command.RemoteControl;
import com.info.command.SmokeMachineOffCommand;
import com.info.command.SmokerMachine;
import com.info.command.SmokerMachineOnCommand;

public class OrderGrillChicken {
	
	public static void main(String[] args) {
		
		Restaurant grillStore = new GrillStore();
		Restaurant smokeStore = new SmokerStore();
		
		GrillChicken wings = grillStore.orderGrill("GrilledChickenWings");
		System.out.println("***** Thomas ordered "+wings.getName()+"**********");
		GrillChicken Skewers = grillStore.orderGrill("ItalianChickenSkewers");
		System.out.println("***** Antony ordered "+Skewers.getName()+"**********");
		
		GrillChicken smokedwings = smokeStore.orderGrill("smokedWings");
		System.out.println("***** Antony ordered "+smokedwings.getName()+"**********");
		GrillChicken smokedSkewers = smokeStore.orderGrill("SmokedChickenSkewers");
		System.out.println("***** Thomas ordered "+smokedSkewers.getName()+"**********");
		
		//Command Pattern 
		System.out.println("******Remote control to on/off the grill machine and smoker machine*****");
		RemoteControl control = new RemoteControl();
		GrillMachine grillMachine = new GrillMachine();
		SmokerMachine smokerMachine = new SmokerMachine();
		
		control.setCommand(new GrillMachineOnCommand(grillMachine));
		control.pressButton();
		
		control.setCommand(new GrillMachineOffCommand(grillMachine));
		control.pressButton();
		
        control.setCommand(new SmokerMachineOnCommand(smokerMachine));
        control.pressButton();
        
        control.setCommand(new SmokeMachineOffCommand(smokerMachine));
        control.pressButton();
        
        
	}

}
