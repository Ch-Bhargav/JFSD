package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class EmployeeManager {
	
	public String saveDate(Employee emp, RegularEmployee remp, ContractEmployee cemp) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		
		session.persist(emp);
		session.persist(remp);
		session.persist(remp);
		
		session.getTransaction().commit();
		
		
		session.close();
		factory.close();
		
		return  "Data insertion Successful";
	}

}
