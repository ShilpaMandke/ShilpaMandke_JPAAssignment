package com.cg.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Book b1 = new Book();
		b1.setISBN(1001);
		b1.setTitle("Knowledge For fun");
		b1.setPrice(450);
		
		
		Author a1=new Author();
		a1.setId(1001);
		a1.setName("Shweta Rana");
		
		a1.addBook(b1);
		
		em.persist(a1);
		
		System.out.println("Added orders along with order details to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}

}
