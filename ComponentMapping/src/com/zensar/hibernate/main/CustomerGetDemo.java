package com.zensar.hibernate.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class CustomerGetDemo {
	
	public static void main(String[] args) {
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Customer cu = s.get(Customer.class, 1002);
		System.out.println(cu.getCustomerId());
		System.out.println(cu.getAddress());
		System.out.println(cu.getAge());
		System.out.println(cu.getGender());
		System.out.println(cu.getBirthDay());
		
		try {
			Name customerName = cu.getCustomerName();
			System.out.println(customerName);
			Blob customerphoto = cu.getProfilePhoto();
			InputStream in = customerphoto.getBinaryStream();
			FileOutputStream fout = new FileOutputStream(".\\resources\\newPhoto.jpg");
			int data = 0;
			while((data = in.read()) != -1) {
				fout.write(data);
			}
			
			in.close();
			fout.close();
			
			Clob description = cu.getDescription();
			Reader r = description.getCharacterStream();
			PrintWriter pw = new PrintWriter(".\\resources\\customerDb.txt");
			int chardata = 0;
			while((chardata = r.read()) != -1) {
				pw.print((char)chardata);
			}
			r.close();
			pw.close();
			
			t.commit();
			s.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}	
}
