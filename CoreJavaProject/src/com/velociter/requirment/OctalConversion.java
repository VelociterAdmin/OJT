package com.velociter.requirment;

public class OctalConversion {
	public String ocatlConversionin(int temp) {
	 String octal="";
	 for(temp=temp;temp>=8;) {
		 octal=temp%8+octal;
		 temp=temp/8;
}
	 octal=temp+octal;
	 System.out.println("Conversion in octal="+octal);
	return null;
	}
}
