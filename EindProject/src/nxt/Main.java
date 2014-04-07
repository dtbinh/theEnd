package nxt;

import lejos.nxt.Button;
import lejos.nxt.SensorPort;

public class Main {
	public static void main(String[] args) {
		//
		Button.waitForAnyPress();
		MyColorSensor cs = new MyColorSensor(SensorPort.S1, SensorPosition.Right);
		MyLightSensor ls = new MyLightSensor(SensorPort.S4, SensorPosition.Left);
		UltraSonicSensor us = new UltraSonicSensor(SensorPort.S2);
		
		GUI gui = new GUI();
		
		new CalibrationController(cs, ls, gui);
		new ObstructionController(cs, ls, us, gui);
		new FollowTheLine(cs, ls);
	}
}
