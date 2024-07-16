package set.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.HashSet; 

public class ComplexSetOperations {

	public static Person findMaxAge(Set<Person> set) {
		return set.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
	}

	public static Person findMinAge(Set<Person> set) {
		return set.stream().min(Comparator.comparingInt(Person::getAge)).orElse(null);
	}

	public static List<Person> sortByAge(Set<Person> set) {
		List<Person> sortedList = new ArrayList<>(set);
		sortedList.sort(Comparator.comparingInt(Person::getAge));
		return sortedList;
	}

	public static Set<Person> filterByAge(Set<Person> set, int age) {
		Set<Person> result = new HashSet<>();
		for (Person person : set) {
			if (person.getAge() > age) {
				result.add(person);
			}
		}
		return result;
	}
}
