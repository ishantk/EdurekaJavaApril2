package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Certificate;
import co.edureka.model.Manager;

public class OneToManyClient {

	public static void main(String[] args) {
		
		Manager mgr = new Manager();
		mgr.setName("Fionna");
		mgr.setSalary(60000);
		mgr.setEmail("fionna@example.com");
		
		
		Certificate c1 = new Certificate();
		c1.setCname("OCJP");
		c1.setCompany("Oracle");
		
		Certificate c2 = new Certificate();
		c2.setCname("CCNA");
		c2.setCompany("Cisco");
		
		Certificate c3 = new Certificate();
		c3.setCname("AWS");
		c3.setCompany("Amazon");
		
		List<Certificate> list = new ArrayList<Certificate>();
		list.add(c1); // 0
		//list.add(c2); // 1
		list.add(c3); // 2
		
		mgr.setCertificates(list); // One To many Linking
		
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
			
			//session.save(mgr);
			
			Manager mRef = (Manager)session.get(Manager.class, 2);
			System.out.println("*****Manager Details*****");
			System.out.println(mRef.getName()+" has following certifications ");
			List<Certificate> certis = mRef.getCertificates();
			for(Certificate c : certis){
				System.out.println(c);
			}
			System.out.println("*************************");
			
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
