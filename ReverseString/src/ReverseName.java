
public class ReverseName {

	public static void main(String[] args) {
		
		String name = "Kurtis";
		
		char[] nameArray=name.toCharArray();
		
		for(int i = nameArray.length-1; i >= 0; i--) {
			System.out.print(nameArray[i]);
		}

	}

}
