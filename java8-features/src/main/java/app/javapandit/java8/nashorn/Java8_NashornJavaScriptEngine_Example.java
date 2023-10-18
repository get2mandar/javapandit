package app.javapandit.java8.nashorn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Java8_NashornJavaScriptEngine_Example {

	public static void main(String[] args) {

		// Here we are generating Nashorn JavaScript Engine
		ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");

		try {
			// InLine JavaScript Code inside Java Code
			System.out.println("InLine JavaScript Code inside Java Code\n");

			scriptEngine.eval("print('Welcome! Executing JavaScript code with the help of Nashorn engine');");

			System.out.println("---------\n");

			// Reading JavaScript from a File with Bindings
			System.out.println("Reading JavaScript from a File with Bindings");

			Bindings bind = scriptEngine.getBindings(ScriptContext.ENGINE_SCOPE);
			bind.put("name", "Simon Reeve");

			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
			URL url = classloader.getResource("welcome.js");

			File file = new File(url.toURI());
			FileInputStream fis = new FileInputStream(file);

			Reader reader = new InputStreamReader(fis);
			scriptEngine.eval(reader);

			System.out.println("---------\n");

			// Calling JavaScript Function From Java Code
			System.out.println("Calling JavaScript Function From Java Code");

			URL urlN = classloader.getResource("functionNashorn.js");

			File fileN = new File(urlN.toURI());
			FileInputStream fisN = new FileInputStream(fileN);

			Reader readerN = new InputStreamReader(fisN);
			scriptEngine.eval(readerN);

			Invocable invocable = (Invocable) scriptEngine;

			System.out.println("\nCall JavaScript Function: funOne()");
			invocable.invokeFunction("funOne", "");

			System.out.println("\nCall JavaScript Function: funTwo(data) with parameters");
			invocable.invokeFunction("funTwo", "Data Pass to JavaScript");

			System.out.println("---------\n");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}