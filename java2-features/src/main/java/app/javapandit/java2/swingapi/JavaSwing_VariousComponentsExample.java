package app.javapandit.java2.swingapi;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JavaSwing_VariousComponentsExample {

	JFrame frame;

	public JavaSwing_VariousComponentsExample() {
		frame = new JFrame();
		frame.setSize(400, 400);

		// Creating the MenuBar and Adding Menu Items
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
		JMenuItem fileOpenMenuItem = new JMenuItem("Open");
		JMenuItem fileSaveAsMenuItem = new JMenuItem("Save As");
		fileMenu.add(fileOpenMenuItem);
		fileMenu.add(fileSaveAsMenuItem);

		// Creating the Panel and Adding Components
		JPanel panel = new JPanel(); // The Panel is not Visible in Output

		JLabel label = new JLabel("Enter Text:");
		JTextField textField = new JTextField(10);
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");

		// Components Added using Flow Layout
		panel.add(label);
		panel.add(textField);
		panel.add(send);
		panel.add(reset);

		// Empty Text Area
		JTextArea textArea = new JTextArea();

		// Adding Components to the JFrame
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, textArea);
		frame.setVisible(true);
	}

	// Main Method
	public static void main(String[] args) {
		new JavaSwing_VariousComponentsExample();
	}
}
