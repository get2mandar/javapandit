package app.javapandit.java2.swingapi;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaSwing_SimpleExample {

	// Main Method
	public static void main(String[] args) {

		// Creating instance of JFrame
		JFrame frame = new JFrame();

		// Creating instance of JButton
		JButton btn = new JButton("Click Button");

		// Set Button x axis, y axis, width, height
		btn.setBounds(130, 100, 130, 40);

		// Add Button to Frame
		frame.getContentPane().add(btn);

		// Frame Size: 400 Width and 400 Height
		frame.setSize(400, 400);

		// No Layout Manager
		frame.getContentPane().setLayout(null);

		// Setting Visibility of Frame, by default it is not visible
		frame.setVisible(true);
	}

}
