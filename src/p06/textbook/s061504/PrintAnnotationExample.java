package p06.textbook.s061504;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보를 얻음
		Method[] declareMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declareMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
		
		System.out.println("[" + method.getName() + "]");
			for(int i = 0; i<printAnnotation.number(); i++) {
				System.out.println(printAnnotation.value());
			}
			System.out.println();
		
			
			try {
				method.invoke(new Service());
			} catch (Exception e) {}
				System.out.println();
			}
		}
	}
}
