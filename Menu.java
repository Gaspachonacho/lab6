package lab6;
import java.util.*;
import java.io.*;

	public class Menu implements MenuItem {

//		Skapar en tom meny med den givna rubriken.

		public static void main(String [] args) throws NullPointerException {
		   	Menu mainMenu = new Menu("Main Menu");
		   	Menu shoppingCart = new Menu("Shopping Cart");
		   	Menu addItem = new Menu("Add item");
		   	 
		   	mainMenu.add(new AbstractMenuItem("Quit") { 
				public void execute() { 
					System.exit(0);
				}
			});	
		   	
		   	mainMenu.add(new AbstractMenuItem("Shopping Cart") { 
		   		public void execute() {
		   			shoppingCart.execute();
		   		}
		   	});
		   	
		   		shoppingCart.add(new AbstractMenuItem("Back") {  
		   			public void execute() {
		   				mainMenu.execute();
		   			}
		   		});
		   		
		   		shoppingCart.add(new AbstractMenuItem("Books") {  
		   			public void execute() {
		   				LinkedList<DataObject> books = new LinkedList<DataObject>();
		   				System.out.println("\n");
		   				Book.printBook(books);
		   				System.out.println("\n");
		   				shoppingCart.execute();
		   			}
		   		});
		   		
		   		shoppingCart.add(new AbstractMenuItem("Movies") {  
		   			public void execute() {
		   				LinkedList<DataObject> movies = new LinkedList<DataObject>();
		   				System.out.println("\n");
		   				Movie.printMovie(movies);
		   				System.out.println("\n");
		   				shoppingCart.execute();
		   			}
		   		});
		   		
		   		shoppingCart.add(new AbstractMenuItem("Clothing") { 
		   			public void execute() {
		   				LinkedList<DataObject> clothings = new LinkedList<DataObject>();
		   				System.out.println("\n");
		   				Clothing.printClothing(clothings);
		   				System.out.println("\n");
		   				shoppingCart.execute();
		   			}
		   		});
		   		
		   		shoppingCart.add(new AbstractMenuItem("Food") { 
		   			public void execute() {
		   				LinkedList<DataObject> fooders = new LinkedList<DataObject>();
		   				System.out.println("\n");
		   				Food.printFood(fooders);
		   				System.out.println("\n");
		   				shoppingCart.execute();
		   			}
		   		});
		   	 
		   	
		   	mainMenu.add(new AbstractMenuItem("Add item") { 
		   		public void execute() {
		   			addItem.execute();
		   		}
		   	});
		   	
		   		addItem.add(new AbstractMenuItem("Back") {
		   			public void execute() {
		   				mainMenu.execute();
		   			}
		   		});
		   		
		   		addItem.add(new AbstractMenuItem("Book") {
	   				public void execute() {
	   					Scanner scan = new Scanner(System.in);
	   					String name = "";
	   					String author = "";
	   					int pages = 0;
	   					int price = 0;
	   					Book newBook = new Book(name, author, pages, price);
	   					
	   					System.out.println("Name: ");
	   					name = scan.nextLine();
	   					newBook.setName(name);
	   					
	   					System.out.println("Author: ");
	   					author = scan.nextLine();
	   					newBook.setAuthor(author);
	   					
	   					System.out.println("Number of pages: ");
	   					pages = scan.nextInt();
	   					newBook.setPages(pages);
	   					
	   					System.out.println("Price In Dollars: ");
	   					price = scan.nextInt();
	   					newBook.setPrice(price);
	   					
	   					Book.addBook(newBook);
	   			
	   					addItem.execute();
	   			}
		   		});
		   		   
		   		addItem.add(new AbstractMenuItem("Movie") {
	   				public void execute() {
	   					Scanner scan = new Scanner(System.in);
	   					String name = "";
	   					String director = "";
	   					int length = 0;
	   					int price = 0;
	   					Movie newMovie = new Movie(name, director, length, price);
	   					
	   					System.out.println("Name: ");
	   					name = scan.nextLine();
	   					newMovie.setName(name);
	   					
	   					System.out.println("Director: ");
	   					director = scan.nextLine();
	   					newMovie.setDirector(director);
	   					
	   					System.out.println("Length In Minutes: ");
	   					length = scan.nextInt();
	   					newMovie.setLength(length);
	   					
	   					System.out.println("Price In Dollars: ");
	   					price = scan.nextInt();
	   					newMovie.setPrice(price);
	   					
	   					Movie.addMovie(newMovie);
	   			
	   					addItem.execute();
	   			}
		   		});
		   		
		   		addItem.add(new AbstractMenuItem("Clothing") {
	   				public void execute() {
	   					Scanner scan = new Scanner(System.in);
	   					String brand = "";
	   					String clothing = "";
	   					String size = "";
	   					String color = "";
	   					int price = 0;
	   					Clothing newClothing = new Clothing(brand, clothing, size, color, price);
	   					
	   					System.out.println("Brand: ");
	   					brand = scan.nextLine();
	   					newClothing.setBrand(brand);
	   				
	   					System.out.println("Clothing Type: ");
	   					clothing = scan.nextLine();
	   					newClothing.setClothing(clothing);
	   					
	   					System.out.println("Size: ");
	   					size = scan.nextLine();
	   					newClothing.setSize(size);
	   					
	   					System.out.println("Color: ");
	   					color = scan.nextLine();
	   					newClothing.setColor(color);
	   					
	   					System.out.println("Price In Dollars: ");
	   					price = scan.nextInt();
	   					newClothing.setPrice(price);
	   					
	   					Clothing.addClothing(newClothing);
	   					
	   					addItem.execute();
	   			}
		   		});
		   		
		   		addItem.add(new AbstractMenuItem("Food") {
	   				public void execute() {
	   					Scanner scan = new Scanner(System.in);
	   					String type = "";
	   					String name = "";
	   					String freshOrFrozen = "";
	   					int price = 0;
	   					Food newFood = new Food(type, name, freshOrFrozen, price);
	   					
	   					System.out.println("Type?: ");
	   					type = scan.nextLine();
	   					newFood.setType(type);
	   					
	   					System.out.println("Name of the food?: ");
	   					name = scan.nextLine();
	   					newFood.setName(name);
	   					
	   					System.out.println("Fresh or frozen?: ");
	   					freshOrFrozen = scan.nextLine();
	   					newFood.setFreshOrFrozen(freshOrFrozen);
	   					
	   					System.out.println("Price in dollars: ");
	   					price = scan.nextInt();
	   					newFood.setPrice(price);
	   					
	   					Food.addFood(newFood);
	   					
	   					addItem.execute();
	   			}
		   		});
		   	 
		   	mainMenu.execute();
		    }

		
	    protected String title;
	    ArrayList<MenuItem> items;
	    
	    public Menu(String title) {
	      	 items = new ArrayList<>();
	      	 this.title = title;
	    }

//		Lägger till ett menyval till menyn.

		public void add(MenuItem item) {
			items.add(item);
		}

		public String getTitle() {
			return title;
		}

// 		Exekverar menyn enligt loopen definierad i punkterna (1) till (4).
// 		(1) Skriver ut menyns rubrik med stora bokstäverunderstruket med
// 		’=’. Därefter följer en numrerad lista över alla menyelement i
// 		denna meny, numrerade från 0.
// 		(2) Användaren får sedan välja ett av alternativen genom att ange
// 		talet framför menyvalet. Vad händer om man inte anger ett giltigt
// 		tal? Användarens menyval exekveras.
// 		(3) Om menyval 0 valts så returnerar metoden. 0 motsvarar
// 		alltså alltid av avsluta/tillbaka/återgå.
// 		(4) gå till (1)
 
		public void execute() {
			MenuItem toExecute = null;
			int counter = 0;
			
			System.out.println(" " + getTitle());
			
			for(int i = 0; i < getTitle().length()+2; i++) {
				System.out.print("=");
			}
			
			System.out.print("\n");
			
			for(MenuItem item : items) {
		   		toExecute = item;
		   		System.out.println(counter + ": " + item.getTitle());
		   		counter++;
		   	 }
		   	 Scanner scan = new Scanner(System.in);
		   	 int a = scan.nextInt(); 
		   	 toExecute = items.get(a);
		   	 toExecute.execute();	
		}

}