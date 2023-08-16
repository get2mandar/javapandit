package app.javapandit.java5.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class JavaAnnotations_ProcessAnnotationExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		new AnnotationDemoClass();
		Class<AnnotationDemoClass> demoClassObj = AnnotationDemoClass.class;
		readAnnotationOn(demoClassObj);

		Method method = demoClassObj.getMethod("getFileInfo", new Class[] {});
		readAnnotationOn(method);
	}

	static void readAnnotationOn(AnnotatedElement element) {
		try {
			System.out.println("\nFinding Annotations on " + element.getClass().getName());
			Annotation[] annotations = element.getAnnotations();

			for (Annotation annotation : annotations) {
				if (annotation instanceof FileInfo) {
					FileInfo fileInfo = (FileInfo) annotation;
					System.out.println("Source : " + fileInfo.source());
					System.out.println("Version : " + fileInfo.version());
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
