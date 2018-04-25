package co.edureka.model;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objArr, Object obj) throws Throwable {
		
		System.out.println("==before start==");
		
		System.out.println("Method Details: "+method.getName());
		
		System.out.println("Method inputs");
		for(Object o : objArr){
			System.out.println(o);
		}
		
		System.out.println("obj is: "+obj);
		
		Employee emp = (Employee)obj;
		emp.name = "John JJ";
		
		System.out.println("==before end==");
	}

}
