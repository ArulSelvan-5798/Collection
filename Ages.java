package collection;

import java.util.ArrayList;

public class Ages {
	public static void main(String [] args) {
		ArrayList<Integer> ages=new ArrayList<>();
		ages.add(24);
		ages.add(12);
		ages.add(16);
		ages.add(25);
		ages.add(25);
		
		ages.set(2,10);
		for(int i=0;i<ages.size();i++) {
			System.out.println(ages.get(i));
		}
		
		
	}

}
