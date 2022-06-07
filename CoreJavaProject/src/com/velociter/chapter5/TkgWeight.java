package com.velociter.chapter5;

public class TkgWeight {
	double kg,ton,gram;
	public TkgWeight(double kilogram,double ton,double gram)
	{
		this.gram=gram;
		this.kg=kilogram;
		this.ton=ton;
	}
		public void kgToGram ()
		{
		System.out.println("Kg into gram:\n");
		gram=kg*1000;
		System.out.println(gram);
		}
		public void kgToTon()
		{
			System.out.println("kg to ton:\n");
		  ton=kg/100;;
		  System.out.println(ton);
		}
		public void tonToKg()
		{
			System.out.println("ton to kg:\n");
			kg=ton/100;
			System.out.println(kg);
		}
		public void tonToGram() {
			System.out.println("ton to gram:/n");
			gram=ton*1000000;
			System.out.println(gram);
		}
		public void gramToKg(){
			System.out.println("gram to kg:/n");
			kg=gram/1000;
			System.out.println(kg);
		}
		public void gramToTon() {
			System.out.println("gram to ton:/n");
			ton=gram*1000000;
			System.out.println(ton);
		}
		public static void main(String[] args) 
		{
		   TkgWeight tkg=new TkgWeight(1,500,0);
		   tkg.kgToGram();
		   tkg.kgToGram();
		   tkg.kgToTon();
		   tkg.gramToTon();
		}
	  
	}

