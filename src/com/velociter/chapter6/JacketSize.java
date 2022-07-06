package com.velociter.chapter6;
	
	public class JacketSize {
		public enum Size {small(36), medium(40), large(42), extra_large(46), extra_extra_large(48)};
		
		//Constructor
		public JacketSize(int chestSize) {
			this.chestSize = chestSize;
		}
		
		//Method will return chestsize for the current jacket size
		public int cheshSize() {
			return chestSize;
		}		
		private int chestSize ;		 							//Field to record chest size				

}