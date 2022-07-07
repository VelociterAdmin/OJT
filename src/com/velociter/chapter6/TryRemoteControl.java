package com.velociter.chapter6;

import static java.lang.Math.random;

public class TryRemoteControl {
	public static void main(String[] args) {
			RemoteControl remote = null;
			int volume = (int) (random()*10);
			//you will create 5 object to operate using remote 
			for(int i = 0 ; i < 5 ; i++) {
				//Now create either a TV or a VCR at random
				if(random()<0.5) //Random choice of TV make and 	screen size
					remote = new TV(random()<0.5?"Sony":"Hitachi",random()<0.5?32:28);
				
				else 	//Random choice of VCR
					remote = new VCR(random()>0.5?"Penasonic":"JVC");
				
				//Now operate it, whatever it is
				remote.powerOnOff();
				remote.channelUp();
				remote.volumeUp((int)(random()*100));
			}
	}
}
