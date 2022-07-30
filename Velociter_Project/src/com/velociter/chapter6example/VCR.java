package com.velociter.chapter6example;
import static java.lang.Math.min;
import static java.lang.Math.max;

public  class VCR implements RemoteControl{
	private String make = null;
	private boolean power = false;
	private int MIN_VOLUME = 0;
	private int MAX_VOLUME = 100;
	private int volume = MIN_VOLUME;
	private int MIN_CHANNEL = 0;
	private int MAX_CHANNEL = 99;
	private int channel = 0;
	
	public VCR(String make) {
		this.make=make;
	}
public boolean powerOnOff() {
	power=!power;
	System.out.println(make +" VCR power"+ (power ? "on.":"off."));
	return power;
}
public int volumeUp(int increment) {
	if(!power) {
		return 0;
	}
	volume+=increment;
	volume=min(volume,MAX_VOLUME);
	return 0;
}
@Override
public int volumeDown(int decrement) {
	volume-=decrement;
	volume=max(volume,MIN_VOLUME);
	return 0;
}
@Override
public void mute() {
	if(!power) {
		return ;
	}
	volume=MIN_VOLUME;
	System.out.println(make + "VCR volume level:"+ volume);
	
}

@Override
public int setChannel(int newChannel) {
	if(power) {
	return 0;
}
	if(newChannel >=MIN_CHANNEL && newChannel<=MAX_CHANNEL)
		channel=newChannel;
	return newChannel;
}
	
@Override
public int channelUp() {
if(!power) {
		
		return 0;
	}
channel=channel<MAX_CHANNEL?++channel:MIN_CHANNEL;

System.out.println(make + " VCR tuned to channel: "+ channel);
return channel;
	}

	@Override
	public int channelDown() {
		if(!power) {
		return 0;
	}
		channel = channel>MIN_CHANNEL ? --channel : MAX_CHANNEL;
		System.out.println(make + " VCR tuned to channel: "+ channel);
		return channel;
		}
}
	


	
