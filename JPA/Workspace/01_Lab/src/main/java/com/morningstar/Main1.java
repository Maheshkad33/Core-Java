package com.morningstar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.morningstar.entities.Customer;


public class Main1 {

	public static void main(String[] args) {
	
		Customer cust = new Customer(105, "ABC", "DEF", "ABC@morning.com", 7956785);
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TEST-LAB");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(cust);//insert on db
		em.getTransaction().commit();
		
		System.out.println("Cutomer Details Added...");
		
		Customer customer1 = em.find(Customer.class, cust.getCustomerId());
		System.out.println("Id: " + customer1.getCustomerId() + " FirstName : "  + customer1.getFirstName() + " lastname: " + customer1.getLastName()
		+ " email: " + customer1.getEmail() + " mobile: " + customer1.getMobile());
		System.out.println("Cutomer Details ......");

		customer1.setEmail("Akshay@morningstar.com");
		
		em.getTransaction().begin();
		em.merge(customer1); // update on db
		em.getTransaction().commit();
	System.out.println("Customer  Data Updated.");

		em.getTransaction().begin();
		em.remove(customer1);
		em.getTransaction().commit();
		System.out.println("customer data deleted.");

		
		em.close();
		factory.close();
		
		
	
		
	
	
	
	}

}
