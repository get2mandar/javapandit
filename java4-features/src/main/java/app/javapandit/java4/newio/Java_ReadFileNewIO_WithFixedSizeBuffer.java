package app.javapandit.java4.newio;

import java.io.File;
import java.io.RandomAccessFile;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java_ReadFileNewIO_WithFixedSizeBuffer {

	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	public static void main(String[] args) {
		System.out.println(sdf.format(new Date()));

		RandomAccessFile raFile;
		try {

			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			URL url = classloader.getResource("niotest.txt");

			File file = new File(url.toURI());

			raFile = new RandomAccessFile(file, "r");

			FileChannel inChannel = raFile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			while (inChannel.read(buffer) > 0) {
				buffer.flip();
				for (int i = 0; i < buffer.limit(); i++) {
					System.out.print((char) buffer.get());
				}
				System.out.println();
				buffer.clear(); // do something with the data and clear/compact it.
			}
			inChannel.close();
			raFile.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println(sdf.format(new Date()));

	}

}
