package com.velociter.experiment;

import java.io.File;
import java.io.FilenameFilter;

public class ListingDirectory  implements FilenameFilter {
		public class listFilter {
		    public String name;                                     // File name filter
	
		    public listFilter(String name) {   // Constructor
		    this.name = name;

		    }

		public boolean accept(File dir, String name) {
		  	boolean fileOK = true;
            
		      if (name != null) {                                      // If there is a name filter specified, check the file name
		      fileOK &= ((String) dir).startsWith(name);
		      }
		       
		}

		@Override
		public boolean accept(File dir, String name) {
			
			return false;
		}
}