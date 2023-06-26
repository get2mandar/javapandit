package app.javapandit.java6.scriptingsupport;

import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptingSupportFromJava6 {

	public static void main(String[] args) {

		// Obtain Manager Object
		ScriptEngineManager scriptMgr = new ScriptEngineManager();

		// Obtain List of Factories
		List<ScriptEngineFactory> factories = scriptMgr.getEngineFactories();

		System.out.println("Supported Script Engines");

		// List All Supported ScriptEngine Factories
		for (ScriptEngineFactory factory : factories) {
			// Obtain Full Name of the ScriptEngine
			String name = factory.getEngineName();
			String version = factory.getEngineVersion();

			// Returns the Name of the Scripting Language Supported by this ScriptEngine
			String language = factory.getLanguageName();
			String languageVersion = factory.getLanguageVersion();

			System.out.printf("Name: %s (%s) : Language: %s v. %s \n", name, version, language, languageVersion);

			// Get a List of Aliases
			List<String> engNames = factory.getNames();
			for (String e : engNames) {
				System.out.printf("\tEngine Alias: %s\n", e);
			}
		}

		// Now we can go and get a Script Engine we want.
		/**
		 * This can be done either by finding a factory that supports our required
		 * scripting language (engine = factory.getScriptEngine();) OR by requesting a
		 * script engine that supports a given language by name from the script engine
		 * manager.
		 **/
		ScriptEngine engine = scriptMgr.getEngineByName("JavaScript");

		// Now we have a script engine instance that can execute some JavaScript
		try {
			System.out.println("--- Execute JavaScript Code ---");
			engine.eval("print('Hello, World!')");
		} catch (ScriptException ex) {
			ex.printStackTrace();
		}
	}
}
