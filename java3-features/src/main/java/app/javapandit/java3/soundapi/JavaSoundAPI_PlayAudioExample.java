package app.javapandit.java3.soundapi;

import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class JavaSoundAPI_PlayAudioExample {

	public static void main(String[] args) {

		try {

			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			URL url = classloader.getResource("free_testAudio_1mb.wav");

			AudioInputStream stream = AudioSystem.getAudioInputStream(new File(url.getPath()));

			AudioFormat format = stream.getFormat();
			if (format.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
				format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, format.getSampleRate(),
						format.getSampleSizeInBits() * 2, format.getChannels(), format.getFrameSize() * 2,
						format.getFrameRate(), true); // bigEndian
				stream = AudioSystem.getAudioInputStream(format, stream);
			}

			SourceDataLine.Info info = new DataLine.Info(SourceDataLine.class, stream.getFormat(),
					((int) stream.getFrameLength() * format.getFrameSize()));
			SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
			line.open(stream.getFormat());
			line.start();

			System.out.println("Sound Play Started...");

			int numRead = 0;
			byte[] buf = new byte[line.getBufferSize()];
			while ((numRead = stream.read(buf, 0, buf.length)) >= 0) {
				int offset = 0;
				while (offset < numRead) {
					offset += line.write(buf, offset, numRead - offset);
				}
			}
			line.drain();
			line.stop();
			System.out.println("Sound Play Completed!");

		} catch (Exception ex) {
			System.out.println("Problem to Play Audio...");
			ex.printStackTrace();
		}
	}
}