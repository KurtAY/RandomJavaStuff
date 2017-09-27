import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args) {
		//english to spansih dictionary
		
		Map<String, String> engSpaDictionary = new HashMap<String,String>();
		
		//Insert into dictionary
		engSpaDictionary.put("Monday", "Lunes");
		engSpaDictionary.put("Tuesday", "Martes");
		engSpaDictionary.put("Wednesday", "Miercoles");
		engSpaDictionary.put("Thursday", "Jueves");
		engSpaDictionary.put("Friday", "Viernes");
		engSpaDictionary.put("Saturday", "Sabado");
		engSpaDictionary.put("Sunday", "Domingo");
		
		//retrieve things from our dictionary
		System.out.println(engSpaDictionary.get("Monday"));
		System.out.println(engSpaDictionary.get("Tuesday"));
		System.out.println(engSpaDictionary.get("Wednesday"));
		System.out.println(engSpaDictionary.get("Thursday"));
		System.out.println(engSpaDictionary.get("Friday"));
		
		//print all keys
		System.out.println(engSpaDictionary.keySet());
		//print all values
		System.out.println(engSpaDictionary.values());
		//print size of dictionary
		System.out.println("Size: " + engSpaDictionary.size());
		
		System.out.println();
		System.out.println();
		
		//shopping list
		Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
		
		//Insert into dictionary
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", true);
		shoppingList.put("Oreos", true);
		shoppingList.put("Eggs", false);
		shoppingList.put("Sugar", false);
		
		//retrieve items
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Sugar"));
		
		//Key value print
		System.out.println(shoppingList.toString());
		
		//Remove from dictionary
		System.out.println(shoppingList.remove("Eggs"));
		System.out.println(shoppingList.toString());
		
		
		//clear
		shoppingList.clear();
		System.out.println(shoppingList.toString());
	}

}
