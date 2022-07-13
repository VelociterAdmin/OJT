package com.velociter.chapter6;
import static java.lang.Math.min;
import static java.lang.Math.max;

public class TV implements RemoteControl{
	private String make = null;
	private int screensize = 0;
	private boolean power = false;
	
	private int MIN_VOLUME = 0;
	private int MAX_VOLUME = 100;
	private int volume = MIN_VOLUME;
	
	private int MIN_CHANNEL = 1;
	private int MAX_CHANNEL = 999;
	private int channel = 0;


	public TV(String make, int screensize) {
		this.make = make;
		this.screensize = screensize;
		//In practice you probably have more
		//argument to set the max and min channel
		//and volume here plus other charactersticks for a perticular TV
	}


	public boolean powerOnOff() {
		power = !power;
		System.out.println(make + " " +screensize + " inch TV power :"+ (power?"on":"off"));
		return power;
	}

	public int volumeUp() {
		if(!power) {							//If power off
			return 0;							//do nothing
		}
			//Set volume - must not be greater then maximum
		volume += 10;
		volume = min(volume, MAX_VOLUME);
		System.out.println(make+ " "+ screensize +" inch TV volume incresed to level :"+ volume);
		return volume;
	}
	public int volumeDown() {
		if(!power) {							//If power off
			return 0;							//do nothing
		}
		
		//Set volume – must not be less than the minimum
		volume -= 10;
		volume = max(volume, MIN_VOLUME);
		System.out.println(make+ " "+ screensize +" inch TV volume decresed to level :"+ volume);
		return volume;
	}
	
	
	public void mute() {
		if(!power) {							//If power off
			return ;							//do nothing
		}
		volume = MIN_VOLUME;
		System.out.println(make+ " "+ screensize +" inch TV volume level :"+ volume);

	}
	public int setChannel(int newChannel) {
		if(!power) {							//If power off
			return 0;							//do nothing
		}
		
		//Channel must be from MIN_CHANNAL to MAX_CHANNEL
		if(newChannel>=MIN_CHANNEL && newChannel<=MAX_CHANNEL) 
			channel = newChannel;
		System.out.println(make +" "+screensize+" Inch TV tuned channel : "+channel);
		return channel;
		
	}
	
	public int channelUp() {
		if(!power) {							//If power off
			return 0;							//do nothing
		}
		
		//Wrap channel down to MIN_CHANNEL when MAX_CHANNEL reached
		channel = channel>MIN_CHANNEL?++channel:MIN_CHANNEL;
		System.out.println(make + " "+ screensize + " inch TV tuned to channel :"+channel);
		return channel;
	}
	
	public int channelDown() {
		if(!power) {							//If power off
			return 0;							//do nothing
		}
		
		//Wrap channel down to MAX_CHANNEL when MIN_CHANNEL reached
		channel = channel>MIN_CHANNEL?--channel:MAX_CHANNEL;
		System.out.println(make + " "+ screensize + " inch TV tuned to channel :"+channel);
		return channel;
		
	}
	
	

}