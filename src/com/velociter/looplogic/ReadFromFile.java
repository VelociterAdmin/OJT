package com.velociter.looplogic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		File file = new File("D://Country csv.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		StringBuffer sb = new StringBuffer();
		String line;
		while((line=br.readLine())!=null) {
			sb.append("'");
			sb.append(line);
			sb.append("'");
			sb.append("\n");
		}
		fr.close();
		System.out.println("Contries names,code,twoDigitCode,threeDigitCode");
		System.out.print(sb.toString());
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D://Country 2.txt")));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
