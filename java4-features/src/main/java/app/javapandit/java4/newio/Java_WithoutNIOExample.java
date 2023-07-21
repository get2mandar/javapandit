package app.javapandit.java4.newio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java_WithoutNIOExample {

	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	public static void main(String[] args) {
		System.out.println(sdf.format(new Date()));

		BufferedReader br = null;
		String currentLineStr = null;

		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			URL url = classloader.getResource("niotest.txt");

			File file = new File(url.toURI());

			br = new BufferedReader(new FileReader(file));

			while ((currentLineStr = br.readLine()) != null) {
				System.out.println(currentLineStr);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ioex) {
				ioex.printStackTrace();
			}
		}
		System.out.println(sdf.format(new Date()));
	}

}
