
public class Book extends Item {

	int ISBN;
	
	public Book(String title, String author, int yearMade,  double price, int ISBN) {
		super(title, author, yearMade, price);
		this.ISBN = ISBN;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
}
