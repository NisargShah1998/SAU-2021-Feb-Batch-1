package com.nisarg.ManyToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class App 
{
    public static void main( String[] args )
    {
    	Session session = SessionService.getSession();
		Transaction tx = session.beginTransaction();
		
		Department d1 = new Department();
		d1.setDepartmentName("d1");
		Department d2 = new Department();
		d2.setDepartmentName("d2");
		
		Employee e1 = new Employee();
		e1.setEmployeeName("e1");
		e1.setDepartment(d1);
		Employee e2 = new Employee();
		e2.setEmployeeName("e2");
		e2.setDepartment(d2);
		Employee e3 = new Employee();
		e3.setEmployeeName("e3");
		e3.setDepartment(d1);
		Employee e4 = new Employee();
		e4.setEmployeeName("e4");
		e4.setDepartment(d2);
		Employee e5 = new Employee();
		e5.setEmployeeName("e5");
		e5.setDepartment(d1);
		
		session.save(d1);
		session.save(d2);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		
		tx.commit();
		session.close();

		System.out.println("Tables created Successfully");
    }
}
