package com.velociter.chapter3;
import java.util.Random;
import java.util.Scanner;
public class RendomChar {

	public static void main(String[] args) {
		Random r=new Random();
		int size,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		size=s.nextInt();
		char c[]=new char[size];
		for( i=0;i<size;i++)
		{
			c[i]=(char)(r.nextInt(26)+'A');
		}
		for(i=0;i<size;i++)
		{
			switch(c[i])
			{
			case 'A':
				System.out.println("This letter cant be printed. Because its vowel");
				break;
			case 'E':
				System.out.println("This letter cant be printed. Because its vowel");
				break;
			case 'I':
				System.out.println("This letter cant be printed. Because its vowel");
				break;
			case 'O':
				System.out.println("This letter cant be printed. Because its vowel");
				break;
			case 'U':
				System.out.println("This letter cant be printed. Because its vowel");
				break;
			default:
				System.out.println(c[i]);
				break;
				
			}
		}
	}

}
