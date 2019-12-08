package lab6;

import java.util.*;

public class Clothing extends DataObject {
	protected String brand;
	protected String clothing;
	protected String size;
	protected String color;
	static LinkedList<DataObject> clothings = new LinkedList<DataObject>();
	
	public Clothing(String brand, String clothing, String size, String color, int price){
		super();
		this.setBrand(brand);
		this.setClothing(clothing);
		this.setSize(size);
		this.setColor(color);
		this.setPrice(price);
	}
	
	public static void addClothing(Clothing c) {
		clothings.add(c);
	}
	
	public String toString() {
		return (this.brand + ", " + this.clothing + ", " + this.size + ", " + this.color + ", " + this.price + "$");
	}
	
	public static void printClothing(LinkedList<DataObject> c) {
		Iterator<DataObject> i = clothings.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setClothing(String clothing) {
		this.clothing = clothing;
	}
	
	public String getClothing() {
		return clothing;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
}