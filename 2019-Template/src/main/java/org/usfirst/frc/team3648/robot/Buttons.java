package org.usfirst.frc.team3648.robot;

public enum Buttons {
	A(1),
	B(2),
	X(3),
	Y(4),
	LEFT_SHOULDER(5),
	RIGHT_SHOULDER(6),
	BACK(7),
	RESTART(8),
	LEFT_JOYSTICK(9),
	RIGHT_JOYSTICK(10);
	
	private int code;
	
	Buttons(int buttonCode){
		this.code = buttonCode;
	}
	
	int getNumber() {
		return code;
	}
}