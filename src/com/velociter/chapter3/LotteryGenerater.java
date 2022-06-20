package com.velociter.chapter3;

public class LotteryGenerater {

	public static void main(String[] args) {
		//int[] diffNum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49};
		int[] diffNum = new int[49];
		for(int a=0;a<diffNum.length;a++) {
			diffNum[a]=a;
//			System.out.println(a);
		}
		for(int j=1;j<=5;j++) {
			System.out.println("Entry :"+j);
			for(int i=1;i<=6;i++) {
				System.out.print(diffNum[((int)(Math.random()*49))]+",");
				
			}
			System.out.println();
		}
	}

}
