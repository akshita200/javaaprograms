package task;
import java.util.Iterator;
import java.util.TreeSet;
public class treeset {
	public static void main(String[] args) {
			TreeSet<String> set = new TreeSet<>();
			//Collection<String> set = new TreeSet<>(Collections.reverseOrder());
			set.add("Neha");
			set.add("yash");
			set.add("Mike");
			set.add("Vidya");
			
			Iterator<String> it = set.iterator();
			String query = "Franc";
			boolean result = false;
			
			while (it.hasNext()) {
				if (it.next().equals(query)) {
					result = true;
					break;
				}
			}
			
			if (result) System.out.println(query + " exists");
			else System.out.println(query + " doesn't exist");

		}

	}


