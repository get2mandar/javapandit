package app.javapandit.java4.imageio;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Java_ImageIO_Example extends JFrame {

	private static final long serialVersionUID = 199959420023211330L;

	private BufferedImage imageBuffer;

	public static void main(String[] args) {
		new Java_ImageIO_Example().setVisible(true);
	}

	public Java_ImageIO_Example() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		URL url = classloader.getResource("user-icon.png");

		try {
			imageBuffer = ImageIO.read(new File(url.toURI()));
			setSize(350, 350);
		} catch (Exception e) {

		}
	}

	public void paint(Graphics g) {
		g.drawImage(imageBuffer, 40, 40, imageBuffer.getWidth(), imageBuffer.getHeight(), this);
	}

}
