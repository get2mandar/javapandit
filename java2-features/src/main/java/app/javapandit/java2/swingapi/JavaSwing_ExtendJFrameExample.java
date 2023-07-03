package app.javapandit.java2.swingapi;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaSwing_ExtendJFrameExample extends JFrame {

	private static final long serialVersionUID = 4877186385294730601L;

	public JavaSwing_ExtendJFrameExample() {

		// Creating instance of JButton
		JButton btn = new JButton("Click Button");

		// Set Button x axis, y axis, width, height
		btn.setBounds(130, 100, 130, 40);

		// Add Button to Frame
		getContentPane().add(btn);

		// Frame Size: 400 Width and 400 Height
		setSize(400, 400);

		// No Layout Manager
		getContentPane().setLayout(null);

		// Setting Visibility of Frame, by default it is not visible
		setVisible(true);
	}

	// Main Method
	public static void main(String[] args) {
		new JavaSwing_ExtendJFrameExample();
	}

}
