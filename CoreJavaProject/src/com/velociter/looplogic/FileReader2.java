package com.velociter.looplogic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileReader2 {




		public static void main(String[] args) throws IOException {
			File file = new File("D://Country 2.csv");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;
			int i=1;
			while((line=br.readLine())!=null) {
				sb.append("insert into Country(countryid,countryname,countryisdcode,countrycodetwo,countrycodethree) values ("+i+",");
				i++;
				sb.append(line);
				sb.append(");\n");
			}
			fr.close();
//			System.out.println("Contries names,code,twoDigitCode,threeDigitCode");
			System.out.print(sb.toString());
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D://Insert query for country.txt")));
			bw.write(sb.toString());
			bw.flush();
			bw.close();
//			System.out.println("Output generated on = D://Insert query for country.txt");
		}

	}


