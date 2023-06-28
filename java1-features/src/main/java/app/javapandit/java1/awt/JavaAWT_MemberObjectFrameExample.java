package app.javapandit.java1.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT_MemberObjectFrameExample {

	// Initializing using Constructor
	JavaAWT_MemberObjectFrameExample() {

		// Creating a Frame
		Frame frame = new Frame();

		// Creating a Label
		Label label = new Label("Employee id:");

		// Creating a Button
		Button button = new Button("Submit");

		// Creating a TextField
		TextField txtField = new TextField();

		// Setting position of above components in the Frame
		label.setBounds(20, 80, 80, 30);
		txtField.setBounds(20, 100, 80, 30);
		button.setBounds(100, 100, 80, 30);

		// Adding Components into Frame
		frame.add(label);
		frame.add(txtField);
		frame.add(button);

		// Frame Size: 400 Width and 400 Height
		frame.setSize(400, 400);

		// Setting the Title of Frame
		frame.setTitle("Employee info");

		// No Layout Manager
		frame.setLayout(null);

		// Setting Visibility of Frame, by default it is not visible
		frame.setVisible(true);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				frame.dispose(); // Use Dispose Method to Close Window
			}
		});
	}

	// Main Method
	public static void main(String args[]) {

		// Creating Instance of Example Class
		new JavaAWT_MemberObjectFrameExample();
	}

}
