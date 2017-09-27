import java.util.ArrayList;

public class Library {
	
	ArrayList<Item> itemList = new ArrayList<Item>();
	
	public void addItem(Item item) {
		itemList.add(item);
		Item.itemID++;
	}
	
	public void removeItem(int itemID) {
		for(int i = 0; i < itemList.size(); i++) {
			if(itemList.get(i).itemID == itemID) {
				itemList.remove(i);
			}
		}
	}
}
