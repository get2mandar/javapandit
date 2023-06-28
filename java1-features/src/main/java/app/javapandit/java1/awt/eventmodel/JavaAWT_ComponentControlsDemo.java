package app.javapandit.java1.awt.eventmodel;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT_ComponentControlsDemo {

	private Frame mainFrame;
	private Label headerLabel;
	private Label statusLabel;
	private Panel controlPanel;

	public JavaAWT_ComponentControlsDemo() {
		baseGUI();
	}

	public static void main(String[] args) {
		JavaAWT_ComponentControlsDemo awtDemo = new JavaAWT_ComponentControlsDemo();
		awtDemo.viewEventsDemo();
	}

	// Prepare Base GUI
	private void baseGUI() {
		mainFrame = new Frame("Java AWT Component Controls Demo");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));

		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				mainFrame.dispose(); // Use Dispose Method to Close Window
			}
		});

		headerLabel = new Label();
		headerLabel.setAlignment(Label.CENTER);

		statusLabel = new Label();
		statusLabel.setAlignment(Label.CENTER);
		statusLabel.setSize(350, 100);

		controlPanel = new Panel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	// View Events Demo
	private void viewEventsDemo() {
		headerLabel.setText("Controls in Action: Buttons");

		Button okButton = new Button("OK");
		Button submitButton = new Button("Submit");
		Button cancelButton = new Button("Cancel");

		okButton.setActionCommand("OK");
		submitButton.setActionCommand("Submit");
		cancelButton.setActionCommand("Cancel");

		okButton.addActionListener(new ButtonClickListener());
		submitButton.addActionListener(new ButtonClickListener());
		cancelButton.addActionListener(new ButtonClickListener());

		controlPanel.add(okButton);
		controlPanel.add(submitButton);
		controlPanel.add(cancelButton);

		mainFrame.setVisible(true);
	}

	private class ButtonClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (command.equals("OK")) {
				statusLabel.setText("'Ok' Button clicked.");
			} else if (command.equals("Submit")) {
				statusLabel.setText("'Submit' Button clicked.");
			} else {
				statusLabel.setText("'Cancel' Button is clicked.");
			}
		}
	}

}
