package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Employee e  = new Employee();
		e.setName("Ayush");
		e.setJoinDate(LocalDate.of(2019, 8, 26));
		e.setSalary(320000);
		
		s.save(e);
		
		WageEmp we = new WageEmp();
		we.setName("Milind");
		we.setJoinDate(LocalDate.of(2019, 8, 27));
		we.setSalary(340000);
		we.setHours(9);
		we.setRate(500);
		
		s.save(we);
		
		t.commit();
		s.close();

	}

}
