package com.velociter.chapter6;
import static java.lang.Math.min;
import static java.lang.Math.max;

public class VCR implements RemoteControl {
	public VCR(String make) {
		this.make = make;
	}
	
	public boolean powerOnOff() {
		power = !power;
		System.out.println(make +" VCR power "+(power?"on":"off"));
		return power;
	}
	
	public int volumeUp() {
		if(!power) {					//If power is off
			return 0;					//do nothing
		}
		
		//Set volume -  must not be greater then MAX_VOLUME
		volume += 10;
		volume = min(volume , MAX_VOLUME);
		System.out.println(make+ " VCR volume incresed to level :"+volume);
		return volume;
	}
	
	public int volumeDown() {
		if(!power) {							//If power off
			return 0;							//do nothing
		}
		
		//Set volume - must not be greater then MIN_VOLUME
		volume -= 10;
		volume = max(volume, MIN_VOLUME);
		System.out.println(make+" VCR volume decresed to level :"+volume);
		return volume;
	}
	
	public void mute() {
		if(!power) {							//If power off
			return;								//do nothing
		}
		volume = MIN_VOLUME;
		System.out.println(make+ " VCR volume level :"+volume);
	}
	
	public int setChannel(int newChannel) {
		if(!power) {							//If power off
			return 0;							//do nothing
		}
		
		//Channel must be from MIN_CHANNEL to MAX_CHANNEL
		if(newChannel>=	MIN_CHANNEL && newChannel<=MAX_CHANNEL) {
			channel = newChannel;
		}
		System.out.println(make +" VCR turned to channel "+channel);
		return channel;
	}
	
	public int channelUp() {
		if(!power) {							//If power off
			return 0;							//do nothing
		}
		
		//Wrap channel round to MIN_CHANNEL when MAX_CHANNEL is reached
		channel = channel<MAX_CHANNEL? ++channel : MIN_CHANNEL;
		System.out.println(make + " VCR tuned to channel :"+channel);
		return channel;
	}
	
	public int channelDown() {
		if(!power) {							//If power off
			return 0;							//do nothing
		}
		
		//Wrap channel round to MIN_CHANNEL when MAX_CHANNEL is reached
		channel = channel>MIN_CHANNEL? --channel : MAX_CHANNEL;
		System.out.println(make+ " VCR tuned to channel :"+channel);
		return channel;
	}
	
	private String make = null;
	private boolean power = false;
	
	private int MIN_VOLUME = 0;
	private int MAX_VOLUME = 100;
	private int volume = MIN_VOLUME;
	
	private int MIN_CHANNEL = 0;
	private int MAX_CHANNEL = 99;
	private int channel = MIN_CHANNEL;
}
