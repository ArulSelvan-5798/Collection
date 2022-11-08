package collection;

import java.util.ArrayList;

public class FindName {
	public static void main(String [] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Arul");
		names.add("STR");
		names.add("Simbu");
		names.add("Sharp");
		names.remove(2);
		
		for(String n:names) {
			System.out.println(n);
		}
		
		//n for each method
		names.forEach(n->System.out.println(n));
		
	}

}
