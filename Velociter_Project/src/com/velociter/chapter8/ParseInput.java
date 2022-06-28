package com.velociter.chapter8;
import java.io.StreamTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

	import java.io.StreamTokenizer;
	import java.io.BufferedReader;
	import java.io.StringReader;
	import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

	public class ParseInput {
		private StreamTokenizer tokenizer;
		  private char separator;

		  public ParseInput(char separator){
		    this.separator = separator;
		    tokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		    setTokenizer();
		  }

		
		  private void setTokenizer() {
		    tokenizer.resetSyntax();              
		    tokenizer.wordChars('\u0000',(char)(separator-1));    
		    tokenizer.wordChars((char)(separator),'\u00ff');   
		    tokenizer.whitespaceChars('\n','\n');                 
		    tokenizer.whitespaceChars(separator,separator);       
		    tokenizer.eolIsSignificant(true); 
		  
		   
		  }
		  public String[] readTokens() {
		    int type = 0;                                         
		    Vector tokens = new  Vector();                         
		    try {
		      while((type = tokenizer.nextToken()) != StreamTokenizer.TT_EOL) {   
		        if(type == StreamTokenizer.TT_WORD)                             
		          tokens.add(tokenizer.sval);                                     
		        else
		          assert false;                                                   
		      }
		    }
		    catch(IOException e) {
		      e.printStackTrace();
		      System.exit(1);
		    }
		    String[] strings = new String[tokens.size()];
		    for(int i = 0 ; i<strings.length; i++ )
		      strings[i] = (String)tokens.elementAt(i);
		 
		    return strings;    
		  }

		  public static void main(String[] args) {
			    char separator = '/';
			    char separator2='"';
			 
	ParseInput tokenizer = new ParseInput(separator);
			  
	 System.out.println("Enter items separated by "+separator+":"); 
	  String[] input = tokenizer.readTokens();
	  System.out.println("The items that you entered are:");
	  
         if(input != null)
			    for( int i = 0 ; i< input.length ; i++)
			      System.out.print(""+separator2+input[i]+separator2+",");
			  }
			}

	

	


