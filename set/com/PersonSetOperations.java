package set.com;


	
	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.Set;

	public class PersonSetOperations {

	    public static void addPersonToSet(Set<Person> set, Person person) {
	        if (set.add(person)) {
	            System.out.println(person + " added to the set.");
	        } else {
	            System.out.println(person + " is a duplicate and was not added.");
	        }
	    }
	}



