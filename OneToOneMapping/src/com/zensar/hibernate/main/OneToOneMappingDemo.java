package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Country;
import com.zensar.entities.Flag;

/**
 * @author Ayush Kumar
 * @creation_date- 26/09/2019
 * @creation_time-14:56
 * @modification_date- 26/09/2019
 * @modification_time- 14:58
 * @version 1.0
 * @copyright Zensar Technologies
 * @description- One to One Mapping
 */

public class OneToOneMappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Country c1 = new Country();
		c1.setCountryId(1);
		c1.setName("India");
		c1.setLanguage("Hindi");
		c1.setPopulation(130000);
		
		
		Flag f1 = new Flag();
		f1.setFlaName("Tri-Color");
		f1.setDescription("3 colours");
		
		c1.setFlag(f1);
		f1.setCountry(c1);
		
		s.save(c1);
		s.save(f1);
		t.commit();
		s.close();
		System.exit(0);
		
		
		
	}

}
