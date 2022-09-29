package com.simple.javaproject;

public class FloatingVariables {
	byte byte_method()
	{
		byte ByteVar=127;
		return ByteVar;
	}
	short short_method() 
	{
		short ShortVar=32767;
		return ShortVar;
	}
	int integer_method() 
	{
		int IntegerVar=2147483647;
		return IntegerVar;
	}
	long long_method() 
	{
		long LongVar = 9223372036854775807L;
		return LongVar;
	}
	public static void main(String[] args) {
//		Floating_Variables obj = new Floating_Variables();
//		byte ByteObj = obj.byte_method();
//		String String="32767";
//		float VariableToCheck=214.7483647F;
//		double pii = 3.141592653589793238;
//		final double pi = 3.141592653589793238f;
//		double TwoPi = pi+pi;
		double a,b,c;
		a = 5.0;
		b = 10.0;
		c = (a-5.0)/(b-10.0);
		System.out.println(c);
//		System.out.println("A:"+a+"\tB:"+b+"\tC:"+c);
//		System.out.println(((Object)VariableToCheck).getClass().getSimpleName());
//		System.out.println("The class of variable is : "+String.getClass().getSimpleName());
//		System.out.println("Byte DataType : "+ByteObj);
//		System.out.println("Short DataType : "+obj.short_method());
//		System.out.println("Integer DataType : "+obj.integer_method());
//		System.out.println("Long DataType : "+obj.long_method());
		//System.out.println("The Value of Pi is :"+pii+"\nThe Value of Pi is :"+pi+" with f in last\nAnd the Value of 2Pi is :"+TwoPi);
	}
}	