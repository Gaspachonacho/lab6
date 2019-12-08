package lab6;

public class DataObject {
	protected String name;
	protected int price;
		
	public DataObject(String name, int price) {
		super();
		this.setName(name);
		this.setPrice(price);
	}

	public DataObject() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name; 
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}