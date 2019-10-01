package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class HqlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		//Query q = s.createQuery("from Product");
		//Query q = s.createQuery("from Product p where p.price>3000 and p.price<90000");
		//Query q = s.createQuery("from Product p where p.price between 3000 and 90000");
		//Query q = s.createQuery("from Product p where p.brand like 'S%'");
		//Query q = s.createQuery("from Product p where p.name='Laptop'");
		
		/*List<Product> products =  q.getResultList();
		
		
		for(Product p: products) {
			System.out.println(p);
		}*/
		
		
		/*Query q = s.createQuery("select p.name, p.price from Product p");
		List<Object[]> objects = q.getResultList();
		for(Object[] o: objects) {
			for(Object ob: o) {
				System.out.println(ob);
			}
		}*/
		
		/*Query q = s.createNamedQuery("select max(p.price) from Product p");
		Double maxPrice = (Double) q.getSingleResult();
		System.out.println(maxPrice);
		
		Query q1 = s.createNamedQuery("select min(p.price) from Product p");
		Double minPrice = (Double) q.getSingleResult();
		System.out.println(minPrice);*/
		
		
		Criteria cr = s.createCriteria(Product.class);
		List<Product> products = cr.list();
		for(Product p: products) {
			System.out.println(p);
		}
		t.commit();
		s.close();

	}
	private static Query args(String string) {
		return null;
	}

}
