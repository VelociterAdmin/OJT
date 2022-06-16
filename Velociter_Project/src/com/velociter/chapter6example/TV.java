package com.velociter.chapter6example;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class TV implements RemoteControl{
	private String make = null;
	private int screenSize=0;
	private boolean power = false;
	private int MIN_VOLUME = 0;
	private int MAX_VOLUME = 100;
	private int volume = MIN_VOLUME;
	private int MIN_CHANNEL = 0;
	private int MAX_CHANNEL = 999;
	private int channel = 0;
	
	public TV(String make,int screensize) {
        this.make=make;
         this.screenSize=screensize;
		
	}

	public boolean powerOnOff() {
	 power = !power;
	 System.out.println(make + " "+ screenSize + " inch TV power " + (power ?"on":"off"));
		
		return power;
	}

	public int volumeUp(int increment) {
		if(!power) {
			return 0;
		}
		volume += increment;
		volume = min(volume, MAX_VOLUME);
		System.out.println(make + " "+ screenSize +" inch TV volume level: "+ volume);		
		return volume;
	}
	
	


	@Override
	public int volumeDown(int decrement) {
		if(!power) {
			return 0;
		

	}
		volume -= decrement;
		volume = max(volume, MIN_VOLUME);
		System.out.println(make + " "+ screenSize + " inch TV power " + volume));
		return volume;
	}

	@Override
	public void mute() {
		if(!power) {
			return; 
			}
		volume = MIN_VOLUME;
		System.out.println(make + " "+ screenSize + " inch TV power " +volume);
	     }

	@Override
	public int setChannel(int newChannel) {
		if(!power) {
			return 0;	
		}
		if(newChannel>=MIN_CHANNEL && newChannel<=MAX_CHANNEL)
			channel=newChannel;
		return newChannel;
	}

	@Override
	public int channelUp() {
		if(!power) {
		
		return 0;
	}
channel=channel<MAX_CHANNEL?++channel:MIN_CHANNEL;

System.out.println(make+""+screenSize+"inch TV tuned to channel:"+channel);
return channel;
	}

	@Override
	public int channelDown() {
		if(!power) {
		return 0;
	}
		channel = channel>MIN_CHANNEL ? --channel : MAX_CHANNEL;
		System.out.println(make +" "+ screenSize + "inch TV tuned to channel:"+ channel);
		return channel;
		}
}
	


	