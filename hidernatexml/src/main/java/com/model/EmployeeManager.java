package com.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.TypedQuery;

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
  
  public String updateData(int id, Employee E ){
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();
    
    session.getTransaction().begin();
    Employee temp = session.find(Employee.class, id);
    temp.setName(E.getName());
    temp.setDept(E.getDept());
    session.getTransaction().commit();
    
    session.close();
    factory.close();
    return "Data inserted successfully";
  }
  
  public String deleteData(int id)
    {
      SessionFactory factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      
      session.getTransaction().begin();
      Employee tmp = session.find(Employee.class, id);
      session.remove(tmp);    
      session.getTransaction().commit();
      
      session.close();
      factory.close();
      return "Data updated successfully";
    }
  
  public List<Employee> getData()
    {
      SessionFactory factory = new Configuration().configure().buildSessionFactory();
      Session session = factory.openSession();
      
      session.getTransaction().begin();
      
      TypedQuery<Employee> qry = session.createQuery("select E from Employee E",Employee.class);
      List<Employee> list = qry.getResultList();
      
      session.getTransaction().commit();
      
      session.close();
      factory.close();
      return list;
    }
}