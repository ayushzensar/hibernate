package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int songId;
	private String songName;
	@ManyToOne
	@JoinColumn(name = "movie_Id")
	private Movie movie;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	
	


	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Song(int songId, String songName) {
		super();
		this.songId = songId;
		this.songName = songName;
	}

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songName=" + songName + "]";
	}

	public Song(String songName) {
		super();
		this.songName = songName;
	}
	
}
