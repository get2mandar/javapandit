package app.javapandit.java1.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT_ExtendFrameExample extends Frame {

	private static final long serialVersionUID = 6969741639710377522L;

	// Initializing Using Constructor
	JavaAWT_ExtendFrameExample() {

		// Creating a Button
		Button b = new Button("Click Me!!");

		// Setting button position on Screen
		b.setBounds(30, 100, 80, 30);

		// Adding button into Frame
		add(b);

		// Frame Size: 400 Width and 400 Height
		setSize(400, 400);

		// Setting the Title of Frame
		setTitle("Basic AWT Example");

		// No Layout Manager
		setLayout(null);

		// Now Frame will be visible, by default it is not visible
		setVisible(true);
	}

	// Main Method
	public static void main(String args[]) {

		// Creating Instance of Frame Class
		JavaAWT_ExtendFrameExample frame = new JavaAWT_ExtendFrameExample();

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				frame.dispose(); // Use Dispose Method to Close Window
			}
		});
	}
}
