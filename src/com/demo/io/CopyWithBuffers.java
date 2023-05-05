package com.demo.io;
import java.io.*;

	public class CopyWithBuffers {

		public static void main(String args[]) throws IOException {
			BufferedReader reader = null;
			BufferedWriter writer = null;
			try {

				reader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Documents\\file\text1.txt"));
				writer = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Documents\\file\text2.txt"));
				int c;
				while ((c = reader.read()) != -1) {

					writer.write(c);

				}

			} finally {

				if (reader != null) {
					reader.close();
				}
				if (writer != null) {

					writer.close();
				}

			}

		}

	}
