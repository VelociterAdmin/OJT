package com.velociter.chapter6example;

public interface RemoteControl {
	
	boolean powerOnOff();
	
	int volumeUp(int increment);
	int volumeDown(int decrement);
	
	void mute();
	int setChannel(int Channel);
	int channelUp();
	int channelDown();

}
