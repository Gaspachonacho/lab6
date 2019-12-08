package lab6;

import java.util.Iterator;
import java.util.LinkedList;

public class Movie extends DataObject {
	protected String director;
	protected int length;
	static LinkedList<DataObject> movies = new LinkedList<DataObject>();
	
	public Movie(String name, String director, int length, int price) {
		super();
		this.setName(name);
		this.setLength(length);
		this.setPrice(price);
		this.setDirector(director);
	}
	
	public static void addMovie(Movie m) {
		movies.add(m);
	}
	
	public String toString() {
		return (this.name + ", " + this.director + ", " + this.length + "min, " + this.price + "$");
	}
	
	public static void printMovie(LinkedList<DataObject> c) {
		Iterator<DataObject> i = movies.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}