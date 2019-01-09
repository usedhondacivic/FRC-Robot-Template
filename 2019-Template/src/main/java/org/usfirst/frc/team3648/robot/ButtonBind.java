package org.usfirst.frc.team3648.robot;

import edu.wpi.first.wpilibj.Joystick;

public class ButtonBind {
	private Buttons positive;
	private Buttons negative;
	private Joystick controller;
	
	public ButtonBind(Buttons bind, Joystick _controller) {
		positive = bind;
		controller = _controller;
	}
	
	public ButtonBind(Buttons pos, Buttons neg, Joystick _controller) {
		positive = pos;
		negative = neg;
		controller = _controller;
	}
	
	public boolean pressed() {
		return controller.getRawButton(positive.getNumber());
	}
	
	public boolean positivePressed() {
		return controller.getRawButton(positive.getNumber());
	}
	
	public boolean negativePressed() {
		return controller.getRawButton(negative.getNumber());
	}
}
