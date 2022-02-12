import java.util.HashSet;
import java.util.TreeSet;

public class ArraysetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet<>();
		
		h.add("Ganesh");
		h.add("Raaj");
		h.add("Suresh");
		
		TreeSet<String> t=new TreeSet<>();
		t.addAll(h);
		
		for(String s:t)
		{
			System.out.println(s);
		}

	}

}
