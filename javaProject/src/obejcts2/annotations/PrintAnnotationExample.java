package obejcts2.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import obejcts2.Week;


public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] methods = Service.class.getDeclaredMethods();
		Constructor[] constructos = Service.class.getDeclaredConstructors();
		Field[] fields = Service.class.getDeclaredFields();

		for (Method method : methods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

				System.out.println("[" + method.getName() + "]");

				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				try {
					method.invoke(new Service());
				} catch (Exception e) {
				}
				System.out.println();
			}
//			getType(Week.SUN)
		}
		
//		public static void getType(Week week) {
//			System.out.println(week.toString());
//		}

	}

}
