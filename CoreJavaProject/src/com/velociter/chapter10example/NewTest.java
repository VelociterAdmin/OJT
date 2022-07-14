package com.velociter.chapter10example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ResourceBundle;

public class NewTest {

	public static void main(String[] args) throws FileNotFoundException {
		ResourceBundle bundle=ResourceBundle.getBundle("Switch");
		System.out.println(bundle);
		System.out.println(bundle.getString("switch").hashCode());
		System.out.println("true".hashCode());
		int a=bundle.getString("switch").hashCode();
		int b="true".hashCode();
		if (a==b) {
			System.out.println("hello guys chai pelo");
		}
		else {
			System.out.println("bhad me jao guys");
		}
	}

}
