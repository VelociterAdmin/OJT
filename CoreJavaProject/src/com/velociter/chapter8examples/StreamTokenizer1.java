/*package com.velociter.chapter8examples;
import java.io.IOException;
import java.io.StringReader;
import java.io.StreamTokenizer;
import java.io.Reader;
public class StreamTokenizer1  {
	public static void main(String[] args) throws IOException
	{
		StreamTokenizer streamTokenizer=null;
		StringReader stringReader=new StringReader("my name is danish");
		streamTokenizer  = new StreamTokenizer(stringReader);
		while((StreamTokenizer1.nextToken())!= StreamTokenizer.TT_EOF)
		{
			if(streamTokenizer.ttype==StreamTokenizer.TT_WORD)
			{
				System.out.println("inside TT_Word="+streamTokenizer.sval);
			}
			else if(streamTokenizer.ttype==StreamTokenizer.TT_NUMBER) {
				System.out.println("Inside TT_NUMBER="+streamTokenizer.nval);
			}
		}

	}

	private static int nextToken() {
		// TODO Auto-generated method stub
		return 0;
	}

}


*/