package com.zensar.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class MovieDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		
		Movie n = s.get(Movie.class, 21);
		
		System.out.println(n.getTitle());
		System.out.println(n.getReleaseDate());
		
		List<Song> songs = n.getSongs();
		
		for(Song s4: songs) {
			System.out.println(s4);
		}
		if(n!=null) {
			s.delete(n);
		}
		else {
			System.out.println("Record not found");
		}
		
		
		t.commit();
		s.close();
		System.exit(0);

	}

}
