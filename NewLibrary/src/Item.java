
public abstract class Item {
	
	static int itemID = 0;
	String title;
	String author;
	int yearMade;
	double price;
	
	public Item(String title, String author, int yearMade, double price) {
		super();
		this.title = title;
		this.author = author;
		this.yearMade = yearMade;
		this.price = price;
	}

	public static int getItemID() {
		return itemID;
	}

	public static void setItemID(int itemID) {
		Item.itemID = itemID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearMade() {
		return yearMade;
	}

	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
} 
