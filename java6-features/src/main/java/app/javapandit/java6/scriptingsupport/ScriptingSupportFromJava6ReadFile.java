package app.javapandit.java6.scriptingsupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptingSupportFromJava6ReadFile {

	public static void main(String[] args) {
		// Obtain Manager Object
		ScriptEngineManager scriptMgr = new ScriptEngineManager();

		// Obtain a Script Engine Object
		ScriptEngine engine = scriptMgr.getEngineByName("JavaScript");

		// Now Read JavaScript from a File
		try {
			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			URL url = classloader.getResource("primes.js");

			File file = new File(url.toURI());
			FileInputStream fis = new FileInputStream(file);

			Reader reader = new InputStreamReader(fis);
			engine.eval(reader);
		} catch (ScriptException | URISyntaxException | FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
