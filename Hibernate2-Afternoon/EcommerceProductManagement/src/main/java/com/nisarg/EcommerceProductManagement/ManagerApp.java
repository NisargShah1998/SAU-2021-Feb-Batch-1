package com.nisarg.EcommerceProductManagement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ManagerApp 
{
    public static void main( String[] args )
    {
		Session session = SessionService.getSession();
		Transaction tx = session.beginTransaction();

		Categories c1 = new Categories();
		c1.setCategoryName("c1");

		Categories c2 = new Categories();
		c2.setCategoryName("c2");
		
		Categories c3 = new Categories();
		c3.setCategoryName("c3");
		
		Categories c4 = new Categories();
		c4.setCategoryName("c4");

		List<Categories> c1_list = new ArrayList<Categories>();
		c1_list.add(c1);
		c1_list.add(c3);

		List<Categories> c2_list = new ArrayList<Categories>();
		c2_list.add(c2);
		c2_list.add(c4);

		List<Categories> c3_list = new ArrayList<Categories>();
		c3_list.add(c3);
		
		Supplier s1 = new Supplier();
		s1.setSupplierName("s1");
		s1.setCategories(c1_list);

		Supplier s2 = new Supplier();
		s2.setSupplierName("s2");
		s2.setCategories(c2_list);
		
		Supplier s3 = new Supplier();
		s3.setSupplierName("s3");
		s3.setCategories(c3_list);

		Product p1 = new Product();
		p1.setProductName("p1");
		p1.setCategories(c2_list);

		Product p2 = new Product();
		p2.setProductName("p2");
		p2.setCategories(c1_list);
		
		Product p3 = new Product();
		p3.setProductName("p3");
		p3.setCategories(c3_list);

		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(s1);
		session.save(s2);
		session.save(s3);

		tx.commit();
		session.close();

		System.out.println("Tables created Successfully");
    }
}
