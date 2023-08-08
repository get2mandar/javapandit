package app.javapandit.java4.prefs;

import java.util.prefs.Preferences;

public class Java_PreferenceExample {

	private Preferences prefs;

	public static void main(String[] args) {

		// RUN THIS PROGRAM TWICE TO SEE THE RESULTS

		Java_PreferenceExample prefsExample = new Java_PreferenceExample();
		prefsExample.setPreferences();
	}

	public void setPreferences() {
		// This will Define a Node in which the Preferences Can be Stored
		prefs = Preferences.userRoot().node(this.getClass().getName());

		String ID1 = "id1";
		String ID2 = "id2";
		String ID3 = "id3";

		// Get the Values
		System.out.println(prefs.getBoolean(ID1, true));
		System.out.println(prefs.get(ID2, "Hello World"));
		System.out.println(prefs.getInt(ID3, 50));

		// Set the Values
		prefs.putBoolean(ID1, false);
		prefs.put(ID2, "Hello Universe");
		prefs.putInt(ID3, 45);

		// Delete the Preference Settings for the First Value
		prefs.remove(ID1);
	}

}
