package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Person;

public class OneToOneClient {

	public static void main(String[] args) {
		
		Person pRef = new Person();
		pRef.setName("John");
		pRef.setEmail("john@exampe.com");
		pRef.setAge(30);
		
		Address aRef = new Address();
		aRef.setAdrsLine("Redwood Shores");
		aRef.setCity("Bengaluru");
		aRef.setState("Karnataka");
		aRef.setZipCode(520001);
		
		// One to One Linking
		pRef.setAdrs(aRef);
		aRef.setPerson(pRef);

		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Parsing the XML File
			
			factory = config.buildSessionFactory(); // Constructing SessionFactory Object by reading the data of XML
			
			session = factory.openSession(); // Created a connection with the DB
			
			transaction = session.beginTransaction(); // Perform DB Operation as a transaction 
			
			session.save(pRef); // Saving the pRef will automatically save aRef as well...
			
			transaction.commit();
			
			System.out.println("==Hibernate Transaction Finished==");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			
			transaction.rollback();
			System.out.println("==Rolling Back the Changes due to Exception==");

		}finally{
			session.close();
			factory.close();
			System.out.println("==Closing the Session==");
		}
				

	}

}
