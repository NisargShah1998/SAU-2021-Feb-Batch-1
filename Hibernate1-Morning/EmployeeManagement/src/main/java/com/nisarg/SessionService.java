package com.nisarg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionService {
	public Session getSession(){
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
}
