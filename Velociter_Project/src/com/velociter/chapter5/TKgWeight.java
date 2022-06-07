package com.velociter.chapter5;

public class TKgWeight {
	public double gram;
	public double kilogram;
	public double ton;
	
	public TKgWeight(double g,double kg,double t ) {
		this.gram=g;
		this.kilogram=kg;
		this.ton=t;
		
	}
	

	public void gramToKilogram() {
	System.out.println("Gram to Kilogram");
		     kilogram=gram/1000;
		     System.out.println(kilogram);
		  }
	public void gramToTon() {
		System.out.println("Gram to Ton");
		ton=gram*100000;
		System.out.println(ton);
	}
	public  void kilogramToGram() {
		System.out.println("Kilogram to Gram");
		 gram=kilogram*1000;
		 System.out.println(gram);
	}
		  public void kilogramToTon() {
			  System.out.println("Kilogram to Tons");
		   ton=kilogram/100;
		   System.out.println(ton);
		  }
		  public void tonToKilogram() {
				System.out.println("Ton to Kilogram");
				kilogram=ton/100;
				System.out.println(kilogram);
		  }
		  public void tonToGram() {
				System.out.println("ton to Gram");
				gram=ton/1000000;
				System.out.println(gram);
		  }
						 
		  
	public static void main(String[]args) {
		TKgWeight weight=new TKgWeight(1000,10,0);
		weight.gramToKilogram();
		weight.kilogramToGram();
		weight.kilogramToTon();
		
	

	}
}