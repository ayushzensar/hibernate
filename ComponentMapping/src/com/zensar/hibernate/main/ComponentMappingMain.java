package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.engine.jdbc.ClobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class ComponentMappingMain {
	public static void main(String[] args) {
		
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Name name = new Name();
		name.setFirstName("Ayush");
		name.setMiddleName("Kumar");
		name.setLastName("Shrivastava");
		
		
		Customer cu = new Customer();
		cu.setCustomerId(1002);
		cu.setCustomerName(name);
		cu.setGender("Male");
		cu.setAge(23);
		cu.setAddress("Bhopal");
		cu.setBirthDay(LocalDate.of(1996, 07, 9));
		try {
			File photo = new File(".\\resources\\wolverine.jpg");
			FileInputStream fin = new FileInputStream(photo);
			
			Blob customerphoto = BlobProxy.generateProxy(fin, photo.length());
			cu.setProfilePhoto(customerphoto);
			
			File file2 = new File(".\\resources\\customerImport.txt");
			FileReader fr = new FileReader(file2);
			Clob description = ClobProxy.generateProxy(fr, file2.length());
			cu.setDescription(description);
			
			
			
			
			s.save(cu);
			t.commit();
			s.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
}
