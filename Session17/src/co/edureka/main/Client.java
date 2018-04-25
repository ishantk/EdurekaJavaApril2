package co.edureka.main;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.Employee;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee emp = context.getBean("empProxy",Employee.class);
		emp.showEmployee("George", "BlockChain");
		

	}

}
