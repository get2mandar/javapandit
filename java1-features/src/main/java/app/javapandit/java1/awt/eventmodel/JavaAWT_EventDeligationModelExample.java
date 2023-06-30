package app.javapandit.java1.awt.eventmodel;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAWT_EventDeligationModelExample {

	public void search() {
		// For Searching
		System.out.println("Searching...");
	}

	public void sort() {
		// For Sorting
		System.out.println("Sorting....");
	}

	public void delete() {
		// For Deleting
		System.out.println("Deleting....");
	}

	// Main Method
	static public void main(String args[]) {
		JavaAWT_EventDeligationModelExample app = new JavaAWT_EventDeligationModelExample();
		new GUI(app);
	}
}

class Command implements ActionListener {
	static final int SEARCH = 0;
	static final int SORT = 1;
	static final int DELETE = 2;

	int id;
	JavaAWT_EventDeligationModelExample app;

	public Command(int id, JavaAWT_EventDeligationModelExample app) {
		this.id = id;
		this.app = app;
	}

	public void actionPerformed(ActionEvent e) {
		switch (id) {
		case SEARCH:
			app.search();
			break;
		case SORT:
			app.sort();
			break;
		case DELETE:
			app.delete();
		}
	}
}

class GUI {

	public GUI(JavaAWT_EventDeligationModelExample app) {
		final Frame frame = new Frame();
		frame.setLayout(new FlowLayout());

		Command searchCmd = new Command(Command.SEARCH, app);
		Command sortCmd = new Command(Command.SORT, app);
		Command deleteCmd = new Command(Command.DELETE, app);

		Button b;
		frame.add(b = new Button("Search"));
		b.addActionListener(searchCmd);
		frame.add(b = new Button("Sort"));
		b.addActionListener(sortCmd);
		frame.add(b = new Button("Delete"));
		b.addActionListener(deleteCmd);

		List list;
		frame.add(list = new List());
		list.add("Alphabetical");
		list.add("Chronological");
		list.addActionListener(sortCmd);
		frame.pack();

		frame.setVisible(true);

		// Frame Size: 400 Width and 400 Height
		frame.setSize(400, 400);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				frame.dispose(); // Use Dispose Method to Close Window
			}
		});
	}
}