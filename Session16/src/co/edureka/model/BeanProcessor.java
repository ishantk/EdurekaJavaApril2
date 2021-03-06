package co.edureka.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanProcessor implements BeanPostProcessor{
	
	public Object postProcessAfterInitialization(Object bean, String beanId) throws BeansException {
	
		System.out.println("==postProcessAfterInitialization== "+beanId);
		
		return bean;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanId) throws BeansException {
		
		System.out.println("==postProcessBeforeInitialization== "+beanId);
		
		return bean;
	}
}
