package com.velociter.chapter9;
//3 Example of chapter 9
import java.io.File;

public interface FilenameFilter { 
	//define abstract method and pass arguments
	public abstract boolean accept(File directory,String filename);

}
