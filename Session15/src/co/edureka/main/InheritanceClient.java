package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.FacebookLogin;
import co.edureka.model.InstagramLogin;
import co.edureka.model.Login;

public class InheritanceClient {

	public static void main(String[] args) {
		
		Login lRef = new Login();
		lRef.setEmail("john@example.com");
		lRef.setPassword("john123");
		
		FacebookLogin fbRef = new FacebookLogin();
		fbRef.setEmail("jennie@example.com");
		fbRef.setPassword("jennie!@#");
		fbRef.setProfilePicUrl("https://www.facebook.com/jenniepicurl.jpg");
		
		InstagramLogin inRef = new InstagramLogin();
		inRef.setEmail("fionna@example.com");
		inRef.setPassword("fionna#123");
		inRef.setProfilePicUrl("https://www.facebook.com/fionnapicurl.jpg");
		inRef.setAlbumUrl("https://www.facebook.com/fionnaalbumcover.jpg");
		
		
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
			
			session.save(lRef);
			session.save(fbRef);
			session.save(inRef);
			
			transaction.commit();
			
			System.out.println("==Hibernate Transaction Finished==");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			e.printStackTrace();
			transaction.rollback();
			System.out.println("==Rolling Back the Changes due to Exception==");

		}finally{
			session.close();
			factory.close();
			System.out.println("==Closing the Session==");
		}		

	}

}
