package com.velociter.arraysstrings;

public class ExtractingString {

	public static void main(String[] args) {
		String text = "Java is a programming language";
		int count =0;
		char seperetor = ' ';
		
		int index=0;
		do {
			++count;
			++index;
			index=text.indexOf(seperetor,index);
		}while(index!=-1);
		
		String[] subStr = new String[count];
		index=0;
		int endIndex = 0;
		for(int i=0; i<count; i++) {
			endIndex = text.indexOf(seperetor,index);
			if(endIndex==-1) {
				subStr[i] = text.substring(index);
			}
			else {
				subStr[i] = text.substring(index,endIndex);
			}
			index=endIndex+1;
		}
		for(int i=0; i<subStr.length;i++){
			System.out.println(subStr[i]);
		}
	}

}
