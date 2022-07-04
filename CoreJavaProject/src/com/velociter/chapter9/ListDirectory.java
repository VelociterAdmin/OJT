package com.velociter.chapter9;

import java.io.File;
import java.io.FileFilter;

public class ListDirectory implements FileFilter{
	public String name;
	public ListDirectory(String name) {
		this.name=name;
	}
	public boolean accept(File pathname) {
		return pathname.isDirectory();
	}
	

}
