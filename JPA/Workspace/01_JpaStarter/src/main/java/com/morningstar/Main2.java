package com.morningstar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.morningstar.entities.Student;

public class Main2 {

	public static void main(String[] args) {
		Student student = new Student(108, "soham", 80);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		System.out.println("Student data Added.");
		// select statement on DB
		Student Student2 = em.find(Student.class, student.getStudentId());
		System.out.println("Id: " + Student2.getStudentId() + " Name: " + Student2.getStudentName() + " Score: "
				+ Student2.getStudentScore());

		Student2.setStudentScore(86);

		em.getTransaction().begin();
		em.merge(Student2); // update on db
		em.getTransaction().commit();
		System.out.println("Student Data Updated.");

		em.getTransaction().begin();
		em.remove(Student2);
		em.getTransaction().commit();
		System.out.println("Student data deleted.");

		em.close();
		factory.close();

	}

}
