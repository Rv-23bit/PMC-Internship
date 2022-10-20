package com.pmc.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeeDBUnit");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();

		Employee firstEmployee = new Employee(1152, "Naomi", "Miller", "Vice President", 160000);

		Employee secondEmployee = new Employee(1147, "Raj", "Patel", "Associate", 90000);

		entityManager.persist(firstEmployee);
		entityManager.persist(secondEmployee);

		entityManager.getTransaction().commit();

		entityManager.close();
		factory.close();

	}
}