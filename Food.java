package lab6;

import java.util.Iterator;
import java.util.LinkedList;

public class Food extends DataObject {
	protected String type;
	protected String freshOrFrozen;
	static LinkedList<DataObject> foods = new LinkedList<DataObject>();
	
	public Food(String type, String name, String freshOrFrozen, int price) {
		super();
		this.setName(name);
		this.setType(type);
		this.setFreshOrFrozen(freshOrFrozen);
		this.setPrice(price);
	}
	
	public static void addFood(Food f) {
		foods.add(f);
	}
	
	public String toString() {
		return (this.type + ", " + this.name + ", " + this.freshOrFrozen + ", " + this.price + "$");
	}
	
	public static void printFood(LinkedList<DataObject> c) {
		Iterator<DataObject> i = foods.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	
	
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setFreshOrFrozen(String freshOrFrozen) {
		this.freshOrFrozen = freshOrFrozen;
	}

	public String getType() {
		return type;
	}
	
	public String getFreshOrFrozen() {
		return freshOrFrozen;
	}
	
}