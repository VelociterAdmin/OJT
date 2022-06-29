package com.velociter.chapter9;

import java.io.File;

public interface FilenameFilter {
	public abstract boolean accept(File directory,String filename);

}
