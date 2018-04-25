package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.CB;
import co.edureka.model.Child;
import co.edureka.model.Employee;
import co.edureka.model.Father;
import co.edureka.model.Person;
import co.edureka.model.Settings;

public class Client {

	public static void main(String[] args) {
		
		// Traditional Way of Constructing Java Object
		/*Employee eRef = new Employee();
		eRef.setEid(1);
		eRef.setName("John");
		eRef.setSalary(50000);

		System.out.println(eRef);
		
		Settings sRef = new Settings();
		sRef.setAppName("Edureka");
		sRef.setAuthor("edureka.co");
		sRef.setBrightness(70);
		sRef.setVolumeLevel(8);
		sRef.setPrimaryColor("Blue");
		
		System.out.println(sRef);*/
		
		// Spring FW
		// Dont create the Object. Let me create it and manage it for you !!
		
		// Inversion Of Control | IOC
		// Developer need not to construct or manage life cycle of an Object. Its the responsibility of Spring FW
		// Use IOC Containers which construct and manages the life cycles of Objects
			//1. BeanFactory
			//2. ApplicationContext
		
		/* Spring Procedure
		 * 1. Create a Bean or Model or POJO
		 * 2. Copy Spring Core Jar Files
		 * 3. Copy an XML file in src directory and configure the object
		 * 4. Write Client Class and code Spring API's to perform IOC (BeanFactory or  ApplicationContext)
		 */
		
		// IOC | BeanFactory
		//Resource resource = new ClassPathResource("application.xml"); // Parsing the XML
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		// We are not constructing the Objects. We are obtaining the reference to the Object created by IOC Container
		//Settings settings1 = (Settings)factory.getBean("sRef1");
		//Settings settings2 = factory.getBean("sRef2",Settings.class);
		
		//System.out.println(settings1);
		//System.out.println(settings2);
		
		// IOC | ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml"); // Parsing the XML
		
		// We are not constructing the Objects. We are obtaining the reference to the Object created by IOC Container
		//Settings settings1 = (Settings)context.getBean("sRef1");
		//Settings settings2 = context.getBean("sRef1",Settings.class);//context.getBean("sRef2",Settings.class);
		
		//System.out.println(settings1);
		//System.out.println(settings2);
		
		
		//Father f = context.getBean("fRef",Father.class);
		//Child c = context.getBean("cRef",Child.class);
		
		//System.out.println(f);
		//System.out.println(c);
		
//		Person p = context.getBean("pRef",Person.class);
//		System.out.println(p);
//		
//		System.out.println(p.getCertificates());
		
		CB cb = context.getBean("cb",CB.class);
		
		cb.getCa().sayHello("John Watson");
		
		//ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		//cxt.close();
	}

}
