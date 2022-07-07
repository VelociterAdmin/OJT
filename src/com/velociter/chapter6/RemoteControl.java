package com.velociter.chapter6;

public interface RemoteControl {
	boolean powerOnOff();				//Returnnew state on = true / off = false
	int volumeUp(int increment);		//Return new volume level
	int volumeDown(int decrement);		//Return new volume level
	void mute();						//Mute sound output
	int setChannel(int channel);		//Set the channel number and return it
	int channelUp();					//Return new channel number
	int channelDown();					//Return new channel number
}