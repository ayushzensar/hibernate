package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		// Singleton and Heavy
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		
		// Product p = new Product(1002,"Blade Pro","Razor", 98000.00);
		
		// s.save(p);
		
		// As per primary key
		
		Product p = s.get(Product.class, 1011);
		// Product p = s.load(Product.class, 1010);
		// System.out.println(p);
		if(p != null) {
			s.delete(p);
		}
		else {
			System.out.println("Product not found!");
		}
		
		t.commit();
		s.close();
		
	}

}
