package com.demo.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

public class FileDemoCharcterStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader inputStream= null;
		FileWriter outputStream= null;
		
		try {
		inputStream= new FileReader("C:\\file\1.txt");
		outputStream = new FileWriter("C:\\file\2.txt");
		  int c;
		   while((c=inputStream.read())!=-1) {
			   outputStream.write(c);
		   }
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception");
		}
		finally {
			if(inputStream!=null) {
				inputStream.close();
			}
			
			if(outputStream!=null) {
				outputStream.close();
			}
		}

	}

}
