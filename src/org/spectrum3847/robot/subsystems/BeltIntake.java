package org.spectrum3847.robot.subsystems;

import org.spectrum3847.lib.drivers.SpectrumSpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;

public class BeltIntake extends Subsystem{

	private SpectrumSpeedController beltMotor;
	
	public BeltIntake(String n, SpectrumSpeedController motor){
		super(n);
		beltMotor = motor;
	}
	
	public void set(double value){
		beltMotor.set(value);
	}
	
	public double getSpeed(){
		return beltMotor.get();
	}
	
	public double getCurrent(){
		return beltMotor.getCurrent();
	}
	
	public void disable(){
		beltMotor.disable();
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}