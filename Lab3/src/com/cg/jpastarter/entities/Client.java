package com.cg.jpastarter.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Book bk= new Book();
		bk.setPrice(500);
		bk.setTitle("50 Shades of Grey");
		
		Book ab= new Book();
		ab.setPrice(600);
		ab.setTitle("Twilight Saga");
		
		
		Author aut = new Author();
		//aut.setId(10);
		aut.setName("Shilpa Mandke");
		aut.addBook(bk);
		aut.addBook(ab);
		
		Author wt = new Author();
		//wt.setId(11);
		wt.setName("Diksha Bhalerao");
		wt.addBook(bk);
		wt.addBook(ab);
		
		em.persist(aut);
		em.persist(wt);
		
		
		System.out.println("Added books with author details.");

		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

}
