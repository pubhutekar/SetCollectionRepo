package set.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperationsExample {

	public static void main(String[] args) {
		Set<Person> hashSet = new HashSet<>();
		Set<Person> linkedHashSet = new LinkedHashSet<>();

		Person p1 = new Person(1, "Alice", 30);
		Person p2 = new Person(2, "Bob", 25);
		Person p3 = new Person(3, "Charlie", 35);
		Person p4 = new Person(1, "Alice Duplicate", 30);

		// Adding elements to sets
		PersonSetOperations.addPersonToSet(hashSet, p1);
		PersonSetOperations.addPersonToSet(hashSet, p2);
		PersonSetOperations.addPersonToSet(hashSet, p3);
		PersonSetOperations.addPersonToSet(hashSet, p4);

		PersonSetOperations.addPersonToSet(linkedHashSet, p1);
		PersonSetOperations.addPersonToSet(linkedHashSet, p2);
		PersonSetOperations.addPersonToSet(linkedHashSet, p3);
		PersonSetOperations.addPersonToSet(linkedHashSet, p4);

		// Set operations
		System.out.println("Union of the sets: " + union(hashSet, linkedHashSet));
		System.out.println("Intersection of the sets: " + intersection(hashSet, linkedHashSet));
		System.out.println("Difference of the sets (hashSet - linkedHashSet): " + difference(hashSet, linkedHashSet));
		System.out.println("Difference of the sets (linkedHashSet - hashSet): " + difference(linkedHashSet, hashSet));
	}

	public static Set<Person> union(Set<Person> set1, Set<Person> set2) {
		Set<Person> result = new HashSet<>(set1);
		result.addAll(set2);
		return result;
	}

	public static Set<Person> intersection(Set<Person> set1, Set<Person> set2) {
		Set<Person> result = new HashSet<>(set1);
		result.retainAll(set2);
		return result;
	}

	public static Set<Person> difference(Set<Person> set1, Set<Person> set2) {
		Set<Person> result = new HashSet<>(set1);
		result.removeAll(set2);
		return result;
	}
}
