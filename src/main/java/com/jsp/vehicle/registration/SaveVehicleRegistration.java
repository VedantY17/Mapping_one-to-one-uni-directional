package com.jsp.vehicle.registration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveVehicleRegistration {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vedant");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = entityManager.getTransaction();

		Registration registration = new Registration();
		registration.setReg_number(1235);
		registration.setCity("PUNE");

		Vehicle vehicle = new Vehicle();
		vehicle.setBrand("mercedes");
		vehicle.setColor("black");
		vehicle.setPrice(3500000);
		vehicle.setRegistration(registration);

		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityManager.persist(registration);
		entityTransaction.commit();

	}
}
