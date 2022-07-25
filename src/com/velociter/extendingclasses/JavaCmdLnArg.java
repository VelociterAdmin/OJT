package com.velociter.extendingclasses;

public class JavaCmdLnArg {

	public static void main(String[] args) {
		for(String arg : args)
			System.out.println("The command line args are : "+arg);
		System.out.println(args[2]);
	}
}
