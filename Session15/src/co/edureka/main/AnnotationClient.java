package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Product;

public class AnnotationClient {

	public static void main(String[] args) {
		
		
		Product p1 = new Product(null, "iPhone", 50000, "Apple");
		Product p2 = new Product(null, "Galalxy", 40000, "Samsung");
		
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure(); 
			
			factory = config.buildSessionFactory(); // Constructing SessionFactory Object by reading the data of XML
			
			session = factory.openSession(); // Created a connection with the DB
			
			transaction = session.beginTransaction(); // Perform DB Operation as a transaction 
			
			session.save(p1);
			session.save(p2);
			
			transaction.commit();
			System.out.println("==Hibernate Transaction Finished==");
			
		}catch (Exception e) {
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
