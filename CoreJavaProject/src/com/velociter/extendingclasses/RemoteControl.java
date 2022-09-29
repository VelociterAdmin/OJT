package com.velociter.extendingclasses;

public interface RemoteControl {
	boolean powerOnOff();				//Returnnew state on = true / off = false
	int volumeUp();						//Return new increased volume level
	int volumeDown();					//Return new decreased volume level
	void mute();						//Mute sound output
	int setChannel(int channel);		//Set the channel number and return it
	int channelUp();					//Return new channel number greater
	int channelDown();					//Return new channel number lower
	
}