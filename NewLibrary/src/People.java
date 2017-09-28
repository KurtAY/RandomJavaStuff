import java.util.ArrayList;

public class People {

	ArrayList<Person> personList = new ArrayList<Person>();
	
	public void addPerson (Person person) {
		personList.add(person);
	}
	
	public void deletePerson (String lastName, int age) {
		for(int i = 0; i >= 0; i++) {
			if(personList.get(i).lastName == lastName &&  personList.get(i).age == age) {
				personList.remove(i);
			}
			else {
				System.out.println("No such person comes to our Library. Re-enter correctly.");
			}
		}
	}
	
	public void updatePersonAge (String firstName, String lastName, int age) {
		for(int i = 0; i >= 0; i++) {
			if(personList.get(i).firstName == firstName && personList.get(i).lastName == lastName && 
					personList.get(i).age == age) {
				personList.get(i).age++;
				System.out.println(firstName + " " + lastName + " age has been updated to " + age);
			}
			else {
				System.out.println("Wrong Credentials entered.");
			}
		}
	}
}
