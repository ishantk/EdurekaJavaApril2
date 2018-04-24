package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Customer;

public class Client {

	public static void main(String[] args) {
		
		/*Customer cRef1 = new Customer();
		cRef1.setId(1);
		cRef1.setName("Fionna");
		cRef1.setEmail("fionna@example.com");
		cRef1.setAddress("Redwood Shores");
		cRef1.setAge(32);
		
		Customer cRef2 = new Customer(null, "Mike", "mike@example.com", "Country Homes", 28);
		
		System.out.println(cRef1); // cRef1.toString()
		System.out.println(cRef2); // cRef3.toString()*/
		
		// Object is constructed in the RAM i.e. temporary
		// Persist the Data in Objects into some DB
		// Hibernate API's to perform DB operations
		
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
			
			// INSERT Operation
			//session.save(cRef1); 
			//session.save(cRef2);

			// RETRIEVE Operation
			//Customer cus = (Customer)session.get(Customer.class, 3);
			//System.out.println(cus);
			
			// UPDATE Operation
			//cus.setName("Fionna F");
			//cus.setAge(43);
			//session.update(cus);
			
			// DELETE Operation
			//session.delete(cus);
			
			// RETRIEVE ALL
			
			//String hql = "From Customer";
			//String hql = "From Customer where id > 2";
			//List<Customer> customers = session.createQuery(hql).list();
			
			/*Criteria criteria = session.createCriteria(Customer.class);
			criteria.add(Restrictions.gt("age", 25));
			List<Customer> customers = criteria.list();
			
			for(Customer cus : customers){
				System.out.println(cus);
			}*/
			
			
			/*for(int i=1;i<=100;i++){
				Customer cus = new Customer(null,"Customer "+i,"cutsomer"+i+"@example.com","customer address"+i,27);
				session.save(cus);
			}*/
			
			
			Customer cus1 = (Customer)session.get(Customer.class, 4);
			Customer cus2 = (Customer)session.get(Customer.class, 4);
			
			System.out.println(cus1);
			System.out.println(cus2);
			
			String hql = "From Customer";
			Query query = session.createQuery(hql);
			query.setCacheable(true);
			
			List<Customer> cutomers = query.list();
			
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
