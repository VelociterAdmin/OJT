package com.velociter.chapter4;
public class ReverseTheSequence {
	public void reverString(String str) {
        String[] text=str.split("  ");
		String reverseString="";
		for(int i=0;i<text.length;i++)
		{
			String string=text[i];
			String reverseText="";
			
		
		for(int j=string.length()-1;j>=0;j--)
		{
			reverseString=reverseString+string.charAt(j);
		}
		reverseString=reverseString+reverseText+" ";
		}
		System.out.println(str);
		System.out.println(reverseString);
		
	}
	public static void main(String[] args)
	{
		ReverseTheSequence rs =new ReverseTheSequence();
		rs.reverString("my name is danish");
	}
		
	  /**  System.out.println(a.toString());
		for(int i=0;i<s.length/2; i++)
		{
			String temp=s[i];
			s[i]=s[s.length-i-1];
			s[s.length-i-1]=temp;
		}
		System.out.println(" ");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}*/
	/**	int i=paragraph.length();
		String reverse="";
		for(int z=i-1;i>=0;i--)
		{
			reverse=(reverse+s.charAt());
		}
		System.out.println(reverse);
		int [] p= {1,2,3,4,5};*/
	}

