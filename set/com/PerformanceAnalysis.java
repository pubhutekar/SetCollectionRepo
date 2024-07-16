package set.com;


	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.Set;

	public class PerformanceAnalysis {

	    public static void main(String[] args) {
	        int size = 1000000;

	        Set<Person> hashSet = new HashSet<>();
	        Set<Person> linkedHashSet = new LinkedHashSet<>();

	        // Measure performance for add operation
	        measurePerformance("HashSet Add", hashSet, size, true);
	        measurePerformance("LinkedHashSet Add", linkedHashSet, size, true);

	        // Measure performance for contains operation
	        measurePerformance("HashSet Contains", hashSet, size, false);
	        measurePerformance("LinkedHashSet Contains", linkedHashSet, size, false);

	        // Measure performance for remove operation
	        measurePerformance("HashSet Remove", hashSet, size, false);
	        measurePerformance("LinkedHashSet Remove", linkedHashSet, size, false);
	    }

	    private static void measurePerformance(String operation, Set<Person> set, int size, boolean addOperation) {
	        long startTime = System.nanoTime();

	        if (addOperation) {
	            for (int i = 0; i < size; i++) {
	                set.add(new Person(i, "Person " + i, i % 100));
	            }
	        } else {
	            for (int i = 0; i < size; i++) {
	                if (operation.contains("Contains")) {
	                    set.contains(new Person(i, "Person " + i, i % 100));
	                } else {
	                    set.remove(new Person(i, "Person " + i, i % 100));
	                }
	            }
	        }

	        long endTime = System.nanoTime();
	        System.out.println(operation + " took " + (endTime - startTime) / 1000000 + " ms");
	    }
	}



