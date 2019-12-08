package lab6;

import java.util.Iterator;
import java.util.LinkedList;

public class Book extends DataObject {
	protected String author;
	protected int pages;
	static LinkedList<DataObject> books = new LinkedList<DataObject>();
	
	public Book(String name, String author, int pages, int price) {
		super();
		this.setName(name);
		this.setAuthor(author);
		this.setPages(pages);
		this.setPrice(price);
	}
	
	public static void addBook(Book b) {
		books.add(b);
	}
	
	public String toString() {
		return (this.name + ", " + this.author + ", " + this.pages + " pages, " + this.price + "$");
	}
	
	public static void printBook(LinkedList<DataObject> c) {
		Iterator<DataObject> i = books.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}