package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class EmployeeManager {
	public String insertData(Employee E)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		session.persist(E);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
		return "Data inserted successfully";
	}
	
	public List<Employee> getData()
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.getTransaction().begin();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cr = cb.createQuery(Employee.class);
		Root<Employee> root = cr.from(Employee.class);
		
		cr.select(root).where(cb.like(root.get("dept"), "%EC%"));
		TypedQuery<Employee> qry = session.createQuery(cr);
		List<Employee> list = qry.getResultList();
		session.getTransaction().commit();
		
		session.close();
		factory.close();
		return list;
	}
}
