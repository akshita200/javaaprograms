package task;
import java.util.HashSet;
import java.util.Iterator;

public class country {
	public static void main(String[] args) {
	HashSet<String> set = new HashSet<>();
			
			set.add("Neha");
			set.add("divya");
			set.add("Mike");
			set.add("Ran");
			
			Iterator<String> it = set.iterator();
			while (it.hasNext())
				System.out.println(it.next());

		}

	}


