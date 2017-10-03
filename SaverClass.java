package hatebreeder;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SaverClass {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		TextContainer tc= new TextContainer();
		Class<?> classOne = tc.getClass();
		SaveTo st =classOne.getAnnotation(SaveTo.class);
		String fileName = st.fileName();
		Method[] methods = classOne.getDeclaredMethods();
		for (Method method : methods) {
			if(method.isAnnotationPresent(Saver.class)){
				method.invoke(tc, fileName);
			}
		}
	}

}
