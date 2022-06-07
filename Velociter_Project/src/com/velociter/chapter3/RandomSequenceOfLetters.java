package com.velociter.chapter3;

import java.util.Random;

public class RandomSequenceOfLetters {

	public static void main(String[] args) {
        int i;
		Random random=new Random();
		char ch[]=new char[10];
		for(i=0;i<10;i++)
		{
			ch[i]=(char)(random.nextInt(26)+'A');
		}
		for( i=0;i<10;i++)
		{
		switch(ch[i])
		{
		case 'A':
			System.out.println("This is vowel");
			break;
	
	    case 'E':
		    System.out.println("This is vowel");
		break;
      
        case 'I':
	        System.out.println("This is vowel");
	    break;
     
        case 'O':
            System.out.println("This is vowel");
	    break;
           
        case 'U':
	        System.out.println("This is vowel");
        break;
        default:
        System.out.println(ch[i]);
        break;
		}
}
	}

}
