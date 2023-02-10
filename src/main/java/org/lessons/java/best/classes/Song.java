package org.lessons.java.best.classes;

public class Song {

	private int id;
	private String title;

	public Song(int _id, String _title) {
		this.id = _id;
		this.title = _title;
	}

	public int getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

}
