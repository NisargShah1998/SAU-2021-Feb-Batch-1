package com.nisarg;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeService {
	Session getSession()
	{
		SessionService service = new SessionService();
		return service.getSession();
	}
	
	void addEmployee(Employee e) 
	{
		Session session = getSession();
		Transaction tx = (Transaction) session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
	}
	
	void updateAllEmployeesDesignation(String designation)
	{
		Session session = getSession();
		Transaction tx = (Transaction) session.beginTransaction();
		session.createQuery("update Employee set designation = :designation").setParameter("designation",designation).executeUpdate();
		tx.commit();
		session.close();
	}
	
	void updateEmployeeSalaryById(int id,double salary)
	{
		Session session = getSession();
		Transaction tx = (Transaction) session.beginTransaction();
		session.createQuery("update Employee set salary = :salary where id = :id").setParameter("salary",salary).setParameter("id",id).executeUpdate();
		tx.commit();
		session.close();
	}
	
	void deleteEmployeeById(int id)
	{
		Session session = getSession();
		Transaction tx = (Transaction) session.beginTransaction();
		session.createQuery("delete from Employee where id = :id").setParameter("id",id).executeUpdate();
		tx.commit();
		session.close();
		
	}
	
	List<Employee> getAllEmployee()
	{
		Session session = getSession();
		Transaction tx = (Transaction) session.beginTransaction();
		@SuppressWarnings("unchecked")
		ArrayList<Employee> list = (ArrayList<Employee>) session.createQuery("from Employee").getResultList();
		tx.commit();
		session.close();
		return list;
	}
	
	Employee getEmployeeByID(int id)
	{
		Session session = getSession();
		Transaction tx = (Transaction) session.beginTransaction();
		Employee e = (Employee)session.get(Employee.class,id);
		tx.commit();
		session.close();
		return e;
	}
}
