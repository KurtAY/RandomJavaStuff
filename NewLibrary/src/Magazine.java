
public class Magazine extends Item {

	int issueNumber;
	
	public Magazine(String title, String author, int yearMade, double price, int issueNumber) {
		super(title, author, yearMade, price);
		this.issueNumber = issueNumber;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	
}
