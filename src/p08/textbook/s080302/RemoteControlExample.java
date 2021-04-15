package p08.textbook.s080302;

import p08.textbook.s080205.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
				//  실행문
			}
			@Override
			public void turnOff() {
				//  실행문	
			}
			@Override
			public void setVolume(int volume) {
				//  실행문
			}
		};
		
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		rc.setMute(false);
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
		
		RemoteControl.changeBattery();
	}
}
