package com.velociter.chapter10example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ResourceBundle;

public class NewTest {

	public static void main(String[] args) throws FileNotFoundException {
     File file=new File("");
     FileOutputStream outputStream=null;
     try {
    	 outputStream =new FileOutputStream("");
    	 
     }
	 catch (FileNotFoundException e) {
		e.printStackTrace(System.err);
		System.exit(1);
		 
     }
     FileChannel channel= outputStream.getChannel();
     
	}

}
