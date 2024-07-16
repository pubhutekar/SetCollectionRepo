package set.com;


	import java.util.HashSet;
	import java.util.Set;

	public class Conference {
	    private Set<Person> attendees;

	    public Conference() {
	        this.attendees = new HashSet<>();
	    }

	    public void addAttendee(Person person) {
	        attendees.add(person);
	    }

	    public void removeAttendee(Person person) {
	        attendees.remove(person);
	    }

	    public Set<Person> findDuplicateAttendees() {
	        Set<Person> duplicates = new HashSet<>();
	        Set<Integer> ids = new HashSet<>();
	        for (Person attendee : attendees) {
	            if (!ids.add(attendee.getId())) {
	                duplicates.add(attendee);
	            }
	        }
	        return duplicates;
	    }

	    public Set<Person> listUniqueAttendees() {
	        return new HashSet<>(attendees);
	    }

	    public Set<Person> findAttendeesByAgeRange(int minAge, int maxAge) {
	        Set<Person> result = new HashSet<>();
	        for (Person attendee : attendees) {
	            if (attendee.getAge() >= minAge && attendee.getAge() <= maxAge) {
	                result.add(attendee);
	            }
	        }
	        return result;
	    }
	}


