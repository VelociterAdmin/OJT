package com.velociter.chapter6example;
import static java.lang.Math.random;

public class TestRemoteControl {

	public static void main(String[] args) {
		
		RemoteControl remote ;
		for(int i = 0 ; i<5 ; i++) {
		if(random()<0.5)
		remote = new TV(random()<0.5 ? "Sony" : "Samsung",random()<0.5 ? 32 : 28);
		else {
		remote = new VCR(random()>0.5 ? "Panasonic": "Crown");
		}
		remote.powerOnOff();  
		remote.channelUp(); 
		remote.volumeUp(20); 
		}
	
		
	}

	

	
	}
