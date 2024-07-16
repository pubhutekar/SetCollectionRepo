package set.com;

import java.util.Set;
import java.util.HashSet; 
import java.util.LinkedHashSet;

public class Main {

	    public static void main(String[] args) {
	        
	        SetOperationsExample.main(args);

	        
	        Set<Person> hashSet = SetOperationsExample.union(new HashSet<>(), new LinkedHashSet<>());
	        hashSet.add(new Person(1, "Alice", 30));
	        hashSet.add(new Person(2, "Bob", 25));
	        hashSet.add(new Person(3, "Charlie", 35));

	        System.out.println("Person with max age: " + ComplexSetOperations.findMaxAge(hashSet));
	        System.out.println("Person with min age: " + ComplexSetOperations.findMinAge(hashSet));
	        System.out.println("Sorted by age: " + ComplexSetOperations.sortByAge(hashSet));
	        System.out.println("Filtered by age > 28: " + ComplexSetOperations.filterByAge(hashSet, 28));

	        
	        PerformanceAnalysis.main(args);

	       
	        Conference conference = new Conference();
	        conference.addAttendee(new Person(1, "sachin", 30));
	        conference.addAttendee(new Person(2, "sagar", 25));
	        conference.addAttendee(new Person(3, "raj", 35));
	        conference.addAttendee(new Person(1, "sachin", 30));

	        System.out.println("Duplicate attendees: " + conference.findDuplicateAttendees());
	        System.out.println("Unique attendees: " + conference.listUniqueAttendees());
	        System.out.println("Attendees aged 25 to 30: " + conference.findAttendeesByAgeRange(25, 30));
	    }
	}



