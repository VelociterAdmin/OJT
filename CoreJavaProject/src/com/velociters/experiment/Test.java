package com.velociters.experiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		String a;
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        a=b.readLine();
		int i=0;
		do {
		i++;
		System.out.println(a.substring(0, 3)+i+a.substring(5));
         
		}
		while(i<=100);

 }
}