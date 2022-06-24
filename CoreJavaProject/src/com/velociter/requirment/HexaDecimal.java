package com.velociter.requirment;

public class HexaDecimal {
	public String hexaDecimal(int temp2) {
	 String hexadecimal="";
	 for(temp2=temp2;temp2>=16;) {
		 hexadecimal=temp2%16+hexadecimal;
		 temp2=temp2/16;
 }
	 hexadecimal=temp2+hexadecimal;
	 System.out.print("Conversion in hexadecimal="+hexadecimal);
	return null;
	 
  }
}

