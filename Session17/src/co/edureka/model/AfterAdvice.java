package co.edureka.model;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object obj1, Method method, Object[] objArr, Object obj2) throws Throwable {
		
		System.out.println("==after start==");
		
		System.out.println("Method Details: "+method.getName());
		
		System.out.println("Method inputs");
		for(Object o : objArr){
			System.out.println(o);
		}
		
		System.out.println("obj1 is: "+obj1);
		System.out.println("obj2 is: "+obj2);
		
		
		System.out.println("==after end==");
		
	}

}
